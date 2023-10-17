package InterfacesАndAbstractionExercise.CollectionHierarchy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AddCollection addCollection = new AddCollection();
        AddRemoveCollection addRemoveCollection = new AddRemoveCollection();
        MyListImpl myList = new MyListImpl();

        String[] inputParts = scanner.nextLine().split("\\s+");
        performAddOperations(inputParts, addCollection);
        performAddOperations(inputParts, addRemoveCollection);
        performAddOperations(inputParts, myList);

        int countRemoves = Integer.parseInt(scanner.nextLine());
        performRemoveOperation(countRemoves, addRemoveCollection);
        performRemoveOperation(countRemoves, myList);

    }

    public static void performAddOperations(String[] words, Addable addable){
        for (String word : words) {
            System.out.print(addable.add(word) + " ");
        }
        System.out.println();
    }

    public static void   performRemoveOperation(int counter, AddRemovable addRemovable){
        for (int i = 0; i < counter; i++) {
            System.out.print(addRemovable.remove() + " ");
        }
        System.out.println();
    }
}
