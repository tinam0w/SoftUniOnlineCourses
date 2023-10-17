package org.example;

import java.util.*;

public class TicTaeToe {

    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameBoard(gameBoard);

        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your placement (1-9): ");

            int playerPosition = scan.nextInt();
            while (playerPositions.contains(playerPosition) || cpuPositions.contains(playerPosition)){
                System.out.print("Position taken! Enter a correct position: ");
                playerPosition = scan.nextInt();
            }

            placePiece(gameBoard, playerPosition, "player");

            String result = checkWinner();
            if (!result.equals("")){
                printGameBoard(gameBoard);
                System.out.println(result);
                break;
            }

            Random random = new Random();
            int cpuPosition = random.nextInt(9) + 1;
            while (playerPositions.contains(cpuPosition) || cpuPositions.contains(cpuPosition)){
                cpuPosition = random.nextInt(9) + 1;
            }

            placePiece(gameBoard, cpuPosition, "cpu");

            result = checkWinner();
            if (!result.equals("")){
                printGameBoard(gameBoard);
                System.out.println(result);
                break;
            }

            printGameBoard(gameBoard);
        }
    }

    private static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void placePiece(char[][] gameBoard, int position, String user) {
        char symbol = ' ';

        if (user.equals("player")) {
            symbol = 'X';
            playerPositions.add(position);
        } else if (user.equals("cpu")) {
            symbol = 'O';
            cpuPositions.add(position);
        }

        switch (position) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    private static String  checkWinner(){
        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List loftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List diagonal1 = Arrays.asList(1, 5, 9);
        List diagonal2 = Arrays.asList(3, 5, 7);

        List<List> winningConditions = new ArrayList<>();
        winningConditions.add(topRow);
        winningConditions.add(midRow);
        winningConditions.add(botRow);
        winningConditions.add(loftCol);
        winningConditions.add(midCol);
        winningConditions.add(rightCol);
        winningConditions.add(diagonal1);
        winningConditions.add(diagonal2);

        for (List l : winningConditions) {
            if (playerPositions.containsAll(l)){
                return "Congratulations, ypu won!";
            } else if (cpuPositions.containsAll(l)) {
                return "Cpu wins! Sorry :(";
            } else if (playerPositions.size() + cpuPositions.size() == 9) {
                return "CAT!";
            }
        }

        return "";
    }
}