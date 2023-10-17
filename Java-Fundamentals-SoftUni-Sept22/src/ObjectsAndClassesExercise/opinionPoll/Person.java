package ObjectsAndClassesExercise.opinionPoll;

public class Person {
    // полета /характеристики/
    private String name;
    private int age;

    // конструктор, за да създ обекти от класа
    public Person(String name, int age) {
        //нов обект
        this.name = name;
        this.age = age;
    }

    // методи /поведение/
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}
