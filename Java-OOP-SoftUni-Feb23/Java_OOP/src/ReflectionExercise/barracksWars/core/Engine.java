package ReflectionExercise.barracksWars.core;

import ReflectionExercise.barracksWars.core.commands.Command;
import ReflectionExercise.barracksWars.interfaces.Repository;
import ReflectionExercise.barracksWars.interfaces.Unit;
import ReflectionExercise.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Engine implements Runnable {

	private Repository repository;
	private UnitFactory unitFactory;

	public Engine(Repository repository, UnitFactory unitFactory) {
		this.repository = repository;
		this.unitFactory = unitFactory;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		while (true) {
			try {
				String input = reader.readLine();
				String[] data = input.split("\\s+");
				String commandName = data[0];
				String result = interpretCommand(data, commandName);
				if (result.equals("fight")) {
					break;
				}
				System.out.println(result);
			} catch (RuntimeException | ClassNotFoundException | InvocationTargetException | NoSuchMethodException |
					 InstantiationException | IllegalAccessException e) {
				System.out.println(e.getMessage());
			} catch (IOException | ExecutionControl.NotImplementedException e) {
				e.printStackTrace();
			}
		}
	}

	// TODO: refactor for problem 4
	private String interpretCommand(String[] data, String commandName) throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
		String commandClassName = commandName.substring(0, 1).toUpperCase() + commandName.substring(1).toLowerCase() + "Command";
		Class<?> clazz = Class.forName("ReflectionExercise.barracksWars.core.commands." + commandClassName);
		Constructor<?> ctor = clazz.getConstructor(String[].class, Repository.class, UnitFactory.class);
		Command command = (Command) ctor.newInstance(data, repository, unitFactory);
		return command.execute();

//		String result;
//		switch (commandName) {
//			case "add":
//				result = this.addUnitCommand(data);
//				break;
//			case "report":
//				result = this.reportCommand(data);
//				break;
//			case "fight":
//				result = this.fightCommand(data);
//				break;
//			default:
//				throw new RuntimeException("Invalid command!");
//		}
//		return result;
	}


}