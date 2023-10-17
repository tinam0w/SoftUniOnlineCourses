package FinalExamDec2022;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> distributorNameMoneySpendMap = new LinkedHashMap<>();
        Map<String, Double> clientNameMoneyEarnedMap = new LinkedHashMap<>();
        double totalMoneySpend = 0;

        String command = scanner.nextLine();
        while (!command.equals("End")) {

            if (command.contains("Deliver")) {
                //"Deliver {DistributorName} {MoneySpend}"
                String distributorName = command.split("\\s+")[1];
                double moneySpend = Double.parseDouble(command.split("\\s+")[2]);
                if (!distributorNameMoneySpendMap.containsKey(distributorName)) {
                    distributorNameMoneySpendMap.put(distributorName, moneySpend);
                } else {
                    double currentMoneySpend = distributorNameMoneySpendMap.get(distributorName);
                    distributorNameMoneySpendMap.put(distributorName, currentMoneySpend + moneySpend);
                }

            } else if (command.contains("Return")) {
                //"Return {DistributorName} {MoneyReturned}"
                String distributorName = command.split("\\s+")[1];
                double moneyReturned = Double.parseDouble(command.split("\\s+")[2]);
                if (distributorNameMoneySpendMap.containsKey(distributorName)) {
                    double currentMoneySpend = distributorNameMoneySpendMap.get(distributorName);
                    if (currentMoneySpend >= moneyReturned) {
                        distributorNameMoneySpendMap.put(distributorName, currentMoneySpend - moneyReturned);
                        if (distributorNameMoneySpendMap.get(distributorName) == 0) {
                            distributorNameMoneySpendMap.remove(distributorName);
                        }
                    }
                }
            } else if (command.contains("Sell")) {
                //"Sell {ClientName} {MoneyEarned}"
                String clientName = command.split("\\s+")[1];
                double moneyEarned = Double.parseDouble(command.split("\\s+")[2]);
                totalMoneySpend += moneyEarned;
                if (!clientNameMoneyEarnedMap.containsKey(clientName)) {
                    clientNameMoneyEarnedMap.put(clientName, moneyEarned);
                } else {
                    double currentMoneyEarned = clientNameMoneyEarnedMap.get(clientName);
                    clientNameMoneyEarnedMap.put(clientName, currentMoneyEarned + moneyEarned);
                }

            }

            command = scanner.nextLine();
        }
//"{ClientName1}: {TotalMoneyEarnedFromThatCustomer1}
        clientNameMoneyEarnedMap.entrySet().forEach(entry -> {
            System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
        });
        System.out.println("-----------");
//{Distributor1}: {TotalMoneySpentToThatDistributor1}
        distributorNameMoneySpendMap.entrySet().forEach(entry -> {
            System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
        });
        System.out.println("-----------");
        System.out.printf("Total Income: %.2f%n", totalMoneySpend);
    }
}
