package com.kodilla.rps;

import java.util.InputMismatchException;
import java.util.Scanner;

@SuppressWarnings("Duplicates")
public class Dialogs {
    private String userName;
    private int roundsAmt;
    private int gameMode;
    private int difficulty;

    public String userNameSetter(){
        System.out.println("Welcome to Rock-Paper-Scissors <Extended Edition>!");
        System.out.println("Please enter your name to continue:");
        System.out.println("Confirm by pressing [ENTER]!");
        Scanner userNameScan = new Scanner(System.in);
        userName = userNameScan.next();
        System.out.println("Good luck " + userName + "!");
        return userName;
    }

    public int roundAmtSetter() {
        System.out.println("Please enter amount of rounds required to win:");
        System.out.println("Confirm by pressing [ENTER]!");
        Scanner roundAmtScan = new Scanner(System.in);
        try {
            roundsAmt = roundAmtScan.nextInt();
            return roundsAmt;
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number!");
            return new Scanner(System.in).nextInt();
        }
    }

    public int gameModeSetter() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please select figures list: \nPress [1] to choose Normal {Rock - Paper - Scissors}" +
                    " \nPress [2] to choose Extended {Rock - Paper - Scissors - Lizard - Spock}");
            System.out.println("Confirm by pressing [ENTER]!");
            int s = scanner.nextInt();
            switch (s){
                case 1:return gameMode = 1;
                case 2:return gameMode = 2;
                default:
                    System.out.println("Wrong sign!");
            }
        }
    }

    public int difficultySetter() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please select difficulty level: \nPress [1] to choose Normal \nPress [2] to choose Hardcore");
            System.out.println("Confirm by pressing [ENTER]!");
            int s = scanner.nextInt();
            switch (s){
                case 1:return difficulty = 1;
                case 2:return difficulty = 2;
                default:
                    System.out.println("Wrong sign!");
            }
        }
    }

    public static void displayGameSettings(String userName, int roundsAmt, int gameMode, int difficultyLevel){
        String gameModeString = (gameMode != 1) ? "Extended" : "Normal";
        String difficultyString = (difficultyLevel != 1) ? "Hardcore" : "Normal";

        System.out.println("Get ready " + userName + "! Rounds amount was set to " + roundsAmt
                + ". Figures list was set to " + gameModeString + ". Difficulty level was set to " + difficultyString + ".");
    }

    public static Choices getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Press [1] to choose Rock; Press [2] to choose Paper; Press [3] to choose Scissors;");
            System.out.println("Press [X] to end the game; Press [N] to start a new game; Press [R] to display rules;");
            System.out.println("Confirm by pressing [ENTER]!");
            String s = scanner.nextLine().toUpperCase();
            switch (s){
                case "1":return Choices.ROCK;
                case "2":return Choices.PAPER;
                case "3":return Choices.SCISSORS;
                case "X":return Choices.QUIT;
                case "N":return Choices.NEW_GAME;
                case "R":return Choices.SHOW_RULES;

                default:
                    System.out.println("Wrong sign!");
            }
        }
    }

    public static Choices getExtendedUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Press [1] to choose Rock; Press [2] to choose Paper; Press [3] to choose Scissors;");
            System.out.println("Press [4] to choose Lizard; Press [5] to choose Spock;");
            System.out.println("Press [X] to end the game; Press [N] to start a new game; Press [R] to display rules;");
            System.out.println("Confirm by pressing [ENTER]!");
            String s = scanner.nextLine().toUpperCase();
            switch (s){
                case "1":return Choices.ROCK;
                case "2":return Choices.PAPER;
                case "3":return Choices.SCISSORS;
                case "4":return Choices.LIZARD;
                case "5":return Choices.SPOCK;
                case "X":return Choices.QUIT;
                case "N":return Choices.NEW_GAME;
                case "R":return Choices.SHOW_RULES;

                default:
                    System.out.println("Wrong sign!");
            }
        }
    }

    public static void showMoves(String userName, Choices playerMove, Choices compMove, Score score){
        System.out.println(userName + " move: "+ playerMove + ", Computer move: " + compMove + "\nRound Result = " + score);
    }

    public static void showScoreboard(String userName, int playerWins, int computerWins, int roundCount) {
        System.out.println("Scoreboard: " + "[" + userName + " wins: " + playerWins + " |" + " Computer wins: " + computerWins +
                " |" + " Round number: " +roundCount + "]");
    }

    public static void showFinalScore(int playerWins, int computerWins) {
        if (playerWins > computerWins) {
            System.out.println("Congratulations, you won!");
        } else if (computerWins > playerWins) {
            System.out.println("You lost, better luck next time!");
        } else  {
            System.out.println("It's a draw! !");
        }
    }

    public static void showNormalRules(){
        System.out.println("Scissors cuts paper, paper covers rock and rock crushes scissors.");
    }

    public static void showExtendedRules(){
        System.out.println("Scissors cuts paper, paper covers rock, rock crushes lizard, lizard poisons Spock, \n" +
                "Spock smashes scissors, scissors decapitates lizard, lizard eats paper, paper disproves Spock,\n" +
                "Spock vaporizes rock, and as it always has, rock crushes scissors. - Sheldon Lee Cooper, Ph.D., Sc.D");
    }

    public static void newGame() {
        boolean isNewGame = true;
        System.out.println("Do you want to start a new game?");
        System.out.println("Press [Y] to start a new game; Press [N] to exit;");
        System.out.println("Confirm by pressing [ENTER]!");
        while(isNewGame) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    RpsRunner.rpsApp();
                case "N":
                    System.out.println("End of the game.");
                    isNewGame = false;
                    break;
                default:
                    System.out.println("Wrong sign!");
            }
        }
    }

    public static void quit(){
        System.out.println("Are you sure that you want end this game?");
        System.out.println("Press [Y] to exit; Press [N] to continue playing;");
        System.out.println("Confirm by pressing [ENTER]!");
        boolean isQuit = true;
        while (isQuit) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "Y":
                    System.out.println("End of the game.");
                    System.exit(0);
                case "N":
                    System.out.println("Resuming the game.");
                    isQuit = false;
                    break;
                default:
                    System.out.println("Wrong sign!");
            }
        }
    }

    public String getUserName() {
        return userName;
    }

    public int getRoundsAmt() {
        return roundsAmt;
    }

    public int getGameMode() {
        return gameMode;
    }

    public int getDifficulty() {
        return difficulty;
    }
}