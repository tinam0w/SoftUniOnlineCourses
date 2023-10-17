package ReflectionExercise.barracksWars.core.factories;

import ReflectionExercise.barracksWars.interfaces.Unit;
import ReflectionExercise.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

	private static final String UNITS_PACKAGE_NAME =
			"ReflectionExercise.barracksWars.models.units.";

	@Override
	public Unit createUnit(String unitType) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		Class<?> unitTypeClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
		Constructor<?> constructor = unitTypeClass.getConstructor();
		return (Unit) constructor.newInstance();
	}
}
