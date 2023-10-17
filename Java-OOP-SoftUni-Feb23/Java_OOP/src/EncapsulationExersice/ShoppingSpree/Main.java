package EncapsulationExersice.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Person> personMap = new LinkedHashMap<>();
        addAllPersons(scanner, personMap);

        Map<String, Product> productMap = new LinkedHashMap<>();
        addAllProducts(scanner, productMap);

        String purchases = scanner.nextLine();
        while (!purchases.equals("END")) {
            String buyer = purchases.split("\\s+")[0];
            String product = purchases.split("\\s+")[1];

            try {
                if (!personMap.isEmpty()) {
                    personMap.get(buyer).buyProduct(productMap.get(product));
                    System.out.println(buyer + " bought " + product);
                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }

            purchases = scanner.nextLine();
        }

        printAllPersonsBags(personMap);
    }

    private static void printAllPersonsBags(Map<String, Person> map) {
        for (Map.Entry<String, Person> person : map.entrySet()) {
            System.out.print(person.getValue().getName() + " - ");
            List<Product> personProducts = person.getValue().getProducts();
            if (personProducts.isEmpty()) {
                System.out.println("Noting bought");
            } else {
                List<String> productNames = new ArrayList<>();
                for (Product personProduct : personProducts) {
                    productNames.add(personProduct.getName());
                }
                System.out.println(String.join(", ", productNames));
            }
        }
    }

    private static void addAllProducts(Scanner scanner, Map<String, Product> productMap) {
        String[] products = scanner.nextLine().split(";");
        for (String product : products) {
            String name = product.split("=")[0];
            double cost = Double.parseDouble(product.split("=")[1]);

            Product product1 = null;
            try {
                product1 = new Product(name, cost);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            if (product1 != null) {
                productMap.put(name, product1);
            }
        }
    }

    private static void addAllPersons(Scanner scanner, Map<String, Person> personMap) {
        String[] persons = scanner.nextLine().split(";");
        for (String person : persons) {
            String name = person.split("=")[0];
            double money = Double.parseDouble(person.split("=")[1]);

            Person person1 = null;
            try {
                person1 = new Person(name, money);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            if (person1 != null) {
                personMap.put(name, person1);
            }
        }

    }
}
