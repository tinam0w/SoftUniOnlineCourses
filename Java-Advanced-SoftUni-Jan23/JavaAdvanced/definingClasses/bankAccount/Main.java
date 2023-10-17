package JavaAdvanced.definingClasses.bankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final String END_COMMAND = "End";
    private static final String CREATE = "Create";
    private static final String DEPOSIT = "Deposit";
    private static final String SET_INTEREST = "SetInterest";
    private static final String GET_INTEREST = "GetInterest";
    private static Map<Integer, BankAccount> accounts; //глобален

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        accounts = new HashMap<>();

        while (!END_COMMAND.equals(input)) {
            String[] parts = input.split("\\s+");
            String command = parts[0];
            String result = "";
            switch (command){
                case CREATE: result = createAccount(); break;
                case DEPOSIT: result = depositInAccount(parts); break;
                case SET_INTEREST: result = setInterest(parts); break;
                case GET_INTEREST: result = getInterest(parts); break;
            }
            if (!result.isEmpty())
                System.out.println(result);
            input = scanner.nextLine();
        }
    }

    private static String getInterest(String[] parts) {
        int id = Integer.parseInt(parts[1]);
        int years = Integer.parseInt(parts[2]);
        BankAccount bankAccount = accounts.get(id);
        if (bankAccount == null){
            return "Account does not exist";
        }
        double interest = bankAccount.getInterest(years);
        return String.format("%.2f", interest);
    }

    private static String setInterest(String[] parts) {
        double interest = Double.parseDouble(parts[1]);
        BankAccount.setInterestRate(interest);
        return "";
    }

    private static String depositInAccount(String[] parts) {
        int accountId = Integer.parseInt(parts[1]);
        double amount = Double.parseDouble(parts[2]);

        BankAccount bankAccount = accounts.get(accountId);

        if (bankAccount == null){
            return "Account does not exist";
        }

        bankAccount.deposit(amount);
        //същото като:
        //accounts.put(accountId, bankAccount);

        return String.format("Deposited %d to ID%d", (int) amount, accountId);
    }

    private static String createAccount() {
        BankAccount bankAccount = new BankAccount();
        int id = bankAccount.getId();
        accounts.put(id, bankAccount);
        return String.format("Account ID%d created", id);
    }
}
