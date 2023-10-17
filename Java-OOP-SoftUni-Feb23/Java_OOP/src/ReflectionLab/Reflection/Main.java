package ReflectionLab.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        Reflection reflection = new Reflection();

        System.out.println(reflection);

        Class<Reflection> reflectionClass = Reflection.class;
        Class<?> aClass = Class.forName("ReflectionLab.Reflection.Reflection");

        System.out.println(reflectionClass);
        System.out.println(aClass);
        //името без пакетите:
        System.out.println(aClass.getSimpleName());
        System.out.println();

        //името на супер класа:
        System.out.println(aClass.getSuperclass());
        //имената на имплементираните интерфейси:
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        System.out.println();

        //създаваме обект без да знаем какъв:
        Object o = aClass.newInstance(); //@Deprecated method
        Object o1 = aClass.getDeclaredConstructor().newInstance();

        System.out.println(o);
        System.out.println(o1);
        System.out.println();

        //всички конструктори:
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            System.out.println(constructor);
        }
        System.out.println();

        //създаваме обект от клас, който не познаваме:
        System.out.println("Instanced objects:");
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            Object o2 = constructor.newInstance();
            System.out.println(o2);
        }
        System.out.println();


    }
}
