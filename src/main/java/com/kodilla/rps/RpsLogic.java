package com.kodilla.rps;

@SuppressWarnings("Duplicates")
public class RpsLogic {
    public static Score compareChoices(Choices playerMove, Choices computerMove) {
        if (playerMove == computerMove) {
            return Score.DRAW;
        } else if (playerMove == Choices.ROCK && computerMove == Choices.PAPER) {
            return Score.LOSE;
        } else if (playerMove == Choices.ROCK && computerMove == Choices.SPOCK) {
            return Score.LOSE;
        } else if (playerMove == Choices.PAPER && computerMove == Choices.SCISSORS) {
            return Score.LOSE;
        } else if (playerMove == Choices.PAPER && computerMove == Choices.LIZARD) {
            return Score.LOSE;
        } else if (playerMove == Choices.SCISSORS && computerMove == Choices.ROCK) {
            return Score.LOSE;
        } else if (playerMove == Choices.SCISSORS && computerMove == Choices.SPOCK) {
            return Score.LOSE;
        } else if (playerMove == Choices.LIZARD && computerMove == Choices.ROCK) {
            return Score.LOSE;
        } else if (playerMove == Choices.LIZARD && computerMove == Choices.SCISSORS) {
            return Score.LOSE;
        } else if (playerMove == Choices.SPOCK && computerMove == Choices.PAPER) {
            return Score.LOSE;
        } else if (playerMove == Choices.SPOCK && computerMove == Choices.LIZARD) {
            return Score.LOSE;
        } else {
            return Score.WIN;
        }
    }

    public static void gameEngine(String userName, int roundsAmt, int gameMode, int difficulty) {
        int playerWins = 0;
        int computerWins = 0;
        int roundCounter = 0;

        while ((playerWins < roundsAmt) && (computerWins < roundsAmt)) {
            ComputerMoves computer = new ComputerMoves();
            if (gameMode == 1) {
                Choices playerMove = Dialogs.getUserSelection();
                Choices computerMove = computer.getComputerMove(difficulty, gameMode, playerMove);
                if (playerMove == Choices.SHOW_RULES) {
                    Dialogs.showNormalRules();
                } else if (playerMove == Choices.QUIT) {
                    Dialogs.quit();
                } else if (playerMove == Choices.NEW_GAME) {
                    Dialogs.newGame();
                } else {
                    Score score = compareChoices(playerMove, computerMove);
                    roundCounter++;
                    if (score == Score.DRAW) {
                        Dialogs.showMoves(userName, playerMove, computerMove, score);
                    } else if (score == Score.WIN) {
                        Dialogs.showMoves(userName, playerMove, computerMove, score);
                        playerWins++;
                    } else {
                        Dialogs.showMoves(userName, playerMove, computerMove, score);
                        computerWins++;
                    }
                    Dialogs.showScoreboard(userName, playerWins, computerWins, roundCounter);
                }
            } else {
                Choices playerMove = Dialogs.getExtendedUserSelection();
                Choices computerMove = computer.getComputerMove(difficulty, gameMode, playerMove);
                if (playerMove == Choices.SHOW_RULES) {
                    Dialogs.showExtendedRules();
                } else if (playerMove == Choices.QUIT) {
                    Dialogs.quit();
                } else if (playerMove == Choices.NEW_GAME) {
                    Dialogs.newGame();
                } else {
                    Score score = compareChoices(playerMove, computerMove);
                    roundCounter++;
                    if (score == Score.DRAW) {
                        Dialogs.showMoves(userName, playerMove, computerMove, score);
                    } else if (score == Score.WIN) {
                        Dialogs.showMoves(userName, playerMove, computerMove, score);
                        playerWins++;
                    } else {
                        Dialogs.showMoves(userName, playerMove, computerMove, score);
                        computerWins++;
                    }
                    Dialogs.showScoreboard(userName, playerWins, computerWins, roundCounter);
                }
            }
        }
        Dialogs.showFinalScore(playerWins, computerWins);
    }
}