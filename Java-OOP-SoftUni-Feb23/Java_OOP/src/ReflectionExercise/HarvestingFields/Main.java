package ReflectionExercise.HarvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Class<RichSoilLand> richSoilLandClass = RichSoilLand.class;
        Field[] declaredFields = richSoilLandClass.getDeclaredFields();

        Field field = richSoilLandClass.getFields()[0];
        int modifiers = field.getModifiers();
        getAccessModifierName(modifiers);

        String command = scanner.nextLine();
        while (!command.equals("HARVEST")) {

            for (Field declaredField : declaredFields) {
                if (command.equals("all") ||
                        command.equals(getAccessModifierName(declaredField.getModifiers()))) {
                    System.out.println(getAccessModifierName(declaredField.getModifiers())
                            + " " + declaredField.getType().getSimpleName()
                            + " " + declaredField.getName());
                }
            }

            command = scanner.nextLine();
        }
    }

    private static String getAccessModifierName(int modifiers) {
        if (Modifier.isPublic(modifiers)) {
            return "public";
        } else if (Modifier.isProtected(modifiers)) {
            return "protected";
        } else if (Modifier.isPrivate(modifiers)) {
            return "private";
        } else {
            return "";
        }
    }
}
