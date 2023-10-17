package InheritanceLab.SingleInheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        System.out.println();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        System.out.println();

        Puppy puppy = new Puppy();
        puppy.weep();
        puppy.bark();
        puppy.eat();

        System.out.println();

        Cat cat = new Cat();
        cat.meow();
        cat.eat();
    }
}
