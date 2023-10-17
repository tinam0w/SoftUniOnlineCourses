package ReflectionExercise.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> blackBoxIntClass = BlackBoxInt.class;
        //търсим констреуктора, за да си създадем обект:
        Constructor<BlackBoxInt> declaredConstructor = blackBoxIntClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        BlackBoxInt blackBoxInt1 = declaredConstructor.newInstance();

        String command = scanner.nextLine();
        while (!"END".equals(command)){
            String[] commandParts = command.split("_");
            String methodName = commandParts[0];
            int parameter = Integer.parseInt(commandParts[1]);

            Method declaredMethod = blackBoxIntClass.getDeclaredMethod(methodName, int.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(blackBoxInt1, parameter);
            Field innerValueField = blackBoxIntClass.getDeclaredField("innerValue");
            innerValueField.setAccessible(true);
            int currentValue = innerValueField.getInt(blackBoxInt1);
            System.out.println(currentValue);

            command = scanner.nextLine();
        }
    }
}
