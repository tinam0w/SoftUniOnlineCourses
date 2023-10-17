package ObjectsAndClassesExercise.orderByAge;

public class Person {
    private String name;
    private String id;
    private int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + " with ID: " + this.id + " is " + this.age + " years old.";
    }
}
