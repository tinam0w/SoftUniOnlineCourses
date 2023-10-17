package ReflectionExercise.barracksWars.core.commands;

import ReflectionExercise.barracksWars.interfaces.Repository;
import ReflectionExercise.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class ReportCommand extends Command{
    public ReportCommand(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ExecutionControl.NotImplementedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String output = this.getRepository().getStatistics();
        return output;
    }
}
