package com.kodilla.rps;

@SuppressWarnings("Duplicates")
public class ComputerMoves {
    public Choices getComputerMove(int difficulty, int gameMode, Choices playerMove){
        ComputerInput computerInput = new ComputerInput();
        Choices tComMove = null;
        if (gameMode == 1 && difficulty == 1) {
            int comMove = computerInput.getNormalComputerInput();
            if (comMove == 1) {
                tComMove = Choices.ROCK;
            } else if (comMove == 2) {
                tComMove = Choices.PAPER;
            } else {
                tComMove = Choices.SCISSORS;
            }
        } else if (gameMode == 1 && difficulty == 2 ) {
            int comMoveHard = computerInput.getHardComputerInput();
            if (playerMove == Choices.PAPER) {
                if (comMoveHard <= 25) {
                    tComMove = Choices.ROCK;
                } else if (comMoveHard <= 50) {
                    tComMove = Choices.PAPER;
                } else {
                    tComMove = Choices.SCISSORS;
                }
            } else if (playerMove == Choices.ROCK) {
                if (comMoveHard <= 25) {
                    tComMove = Choices.SCISSORS;
                } else if (comMoveHard <= 50) {
                    tComMove = Choices.ROCK;
                } else {
                    tComMove = Choices.PAPER;
                }
            } else {
                if (comMoveHard <= 25) {
                    tComMove = Choices.PAPER;
                } else if (comMoveHard <= 50) {
                    tComMove = Choices.SCISSORS;
                } else {
                    tComMove = Choices.ROCK;
                }
            }
        } else if (gameMode == 2 && difficulty == 1 ) {
            int comMove = computerInput.getExtendedComputerInput();
            if (comMove == 1) {
                tComMove = Choices.ROCK;
            } else if (comMove == 2) {
                tComMove = Choices.PAPER;
            } else if (comMove == 3) {
                tComMove = Choices.SCISSORS;
            } else if (comMove == 4) {
                tComMove = Choices.LIZARD;
            } else {
                tComMove = Choices.SPOCK;
            }
        } else if (gameMode == 2 && difficulty == 2 ) {
            int comMoveHard = computerInput.getHardComputerInput();
            if (playerMove == Choices.PAPER) {
                if (comMoveHard <= 13) {
                    tComMove = Choices.ROCK;
                } else if (comMoveHard <= 25) {
                    tComMove = Choices.SPOCK;
                } else if (comMoveHard <= 50) {
                    tComMove = Choices.PAPER;
                } else if (comMoveHard <= 75) {
                    tComMove = Choices.SCISSORS;
                } else {
                    tComMove = Choices.LIZARD;
                }
            } else if (playerMove == Choices.ROCK) {
                if (comMoveHard <= 13) {
                    tComMove = Choices.SCISSORS;
                } else if (comMoveHard <= 25) {
                    tComMove = Choices.LIZARD;
                } else if (comMoveHard <= 50) {
                    tComMove = Choices.ROCK;
                } else if (comMoveHard <= 75) {
                    tComMove = Choices.PAPER;
                } else {
                    tComMove = Choices.SPOCK;
                }
            } else if (playerMove == Choices.SCISSORS) {
                if (comMoveHard <= 13) {
                    tComMove = Choices.PAPER;
                } else if (comMoveHard <= 25) {
                    tComMove = Choices.LIZARD;
                } else if (comMoveHard <= 50) {
                    tComMove = Choices.SCISSORS;
                } else if (comMoveHard <= 75) {
                    tComMove = Choices.ROCK;
                } else {
                    tComMove = Choices.SPOCK;
                }
            } else if (playerMove == Choices.LIZARD) {
                if (comMoveHard <= 13) {
                    tComMove = Choices.PAPER;
                } else if (comMoveHard <= 25) {
                    tComMove = Choices.SPOCK;
                } else if (comMoveHard <= 50) {
                    tComMove = Choices.LIZARD;
                } else if (comMoveHard <= 75) {
                    tComMove = Choices.ROCK;
                } else {
                    tComMove = Choices.SCISSORS;
                }
            } else {
                if (comMoveHard <= 13) {
                    tComMove = Choices.SCISSORS;
                } else if (comMoveHard <= 25) {
                    tComMove = Choices.ROCK;
                } else if (comMoveHard <= 50) {
                    tComMove = Choices.SPOCK;
                } else if (comMoveHard <= 75) {
                    tComMove = Choices.PAPER;
                } else {
                    tComMove = Choices.LIZARD;
                }
            }
        } return tComMove;
    }
}