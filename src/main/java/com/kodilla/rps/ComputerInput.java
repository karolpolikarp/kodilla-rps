package com.kodilla.rps;

import java.util.Random;

public class ComputerInput {
    Random random = new Random();

    public int getNormalComputerInput() {
        return random.nextInt(3) + 1;
    }

    public int getExtendedComputerInput() {
        return random.nextInt(5) + 1;
    }

    public int getHardComputerInput() {
        return random.nextInt(100) + 1;
    }
}