package IteratorsExersice.StrategyPattern;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person first, Person second) {
        if (first.getName().length() == second.getName().length()) {
            char letter1 = first.getName().toLowerCase().charAt(0);
            char letter2 = second.getName().toLowerCase().charAt(0);
            return Character.compare(letter1, letter2);
        }
        return first.getName().length() - second.getName().length();
    }
}