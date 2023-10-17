package ReflectionExercise.barracksWars.core.commands;

import ReflectionExercise.barracksWars.interfaces.Repository;
import ReflectionExercise.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class RetireCommand extends Command {
    public RetireCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        try {
            getRepository().removeUnit(getData()[1]);
            return getData()[1] + " retired!";
        } catch (IllegalStateException e) {
            return e.getMessage();
        }
    }
}
