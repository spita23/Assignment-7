import java.util.Scanner;

public class RockPaperScissors {

    public static String GetComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) {
            return "rock";
        } else if (choice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String WinorLose(String userChoice, String computerChoice) {
        if (userChoice.equals("rock") && computerChoice.equals("rock")) {
            return "draw";
        } else if (userChoice.equals("rock") && computerChoice.equals("paper")) {
            return "computer wins";
        } else if (userChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "user wins";
        } else if (userChoice.equals("paper") && computerChoice.equals("rock")) {
            return "user wins";
        } else if (userChoice.equals("paper") && computerChoice.equals("paper")) {
            return "draw";
        } else if (userChoice.equals("paper") && computerChoice.equals("scissors")) {
            return "computer wins";
        } else if (userChoice.equals("scissors") && computerChoice.equals("rock")) {
            return "computer wins";
        } else if (userChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "user wins";
        } else if (userChoice.equals("scissors") && computerChoice.equals("scissors")) {
            return "draw";
        } else {
            return "error";
        }
    }

    public static String userChoicetoString(int userChoice) {
        if (userChoice == 1) {
            return "rock";
        } else if (userChoice == 2) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static void main(String[] args) {
        System.out.println("Rock Paper Scissors");
        System.out.println("Enter 1 for Rock");
        System.out.println("Enter 2 for Paper");
        System.out.println("Enter 3 for Scissors");
        System.out.println("Enter 4 for Quit");
        System.out.println("Enter your choice: ");
        // read one user input integer after program has run with scanner and call the variable choice
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        String userChoice = userChoicetoString(choice);
        if (choice == 1) {
            System.out.println("You chose Rock");
            System.out.println("Computer chose " + GetComputerChoice());
            System.out.println(WinorLose(userChoice, GetComputerChoice()));
        } else if (choice == 2) {
            System.out.println("You chose Paper");
            System.out.println("Computer chose " + GetComputerChoice());
            System.out.println(WinorLose(userChoice, GetComputerChoice()));
        } else if (choice == 3) {
            System.out.println("You chose Scissors");
            System.out.println("Computer chose " + GetComputerChoice());
            System.out.println(WinorLose(userChoice, GetComputerChoice()));
        } else if (choice == 4) {
            System.out.println("You chose Quit");
        }
    }
}



