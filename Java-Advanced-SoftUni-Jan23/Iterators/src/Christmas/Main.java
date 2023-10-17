package Christmas;

public class Main {
    public static void main(String[] args) {
// Initialize the repository
        Bag bag = new Bag("black", 10);

// Initialize entity
        Present present = new Present("Doll", 0.4, "girl");

// Print Christmas.Present
        System.out.println(present); // Christmas.Present Doll (0.40) for a girl

// Add Christmas.Present
        bag.add(present);

// Remove Christmas.Present
        bag.remove("Toy"); // false

        Present secondPresent = new Present("Train", 2, "boy");
// Add Christmas.Present
        bag.add(secondPresent);

        Present heaviestPresent = bag.heaviestPresent();
        System.out.println(heaviestPresent);
// Christmas.Present Train (2.00) for a boy

        Present p = bag.getPresent("Doll");
        System.out.println(p);
// Christmas.Present Doll (0.40) for a girl

        System.out.println(bag.count()); // 2
        System.out.println(bag.report());

// Black bag contains:
// Christmas.Present Doll (0.40) for a girl
// Christmas.Present Train (2.00) for a boy

    }
}
