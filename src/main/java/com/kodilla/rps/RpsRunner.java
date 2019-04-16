package com.kodilla.rps;

public class RpsRunner {

    public static void rpsApp() {
        Dialogs dialogs = new Dialogs();

        dialogs.userNameSetter();
        dialogs.roundAmtSetter();
        dialogs.gameModeSetter();
        dialogs.difficultySetter();

        Dialogs.displayGameSettings(
                dialogs.getUserName(),
                dialogs.getRoundsAmt(),
                dialogs.getGameMode(),
                dialogs.getDifficulty());

        RpsLogic.gameEngine(
                dialogs.getUserName(),
                dialogs.getRoundsAmt(),
                dialogs.getGameMode(),
                dialogs.getDifficulty());

        Dialogs.newGame();
    }

    public static void main(String[] args) {
        rpsApp();
    }
}