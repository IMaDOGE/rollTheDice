package hu.unideb.inf.mobil2023.projekt;

import java.util.Random;

public class Dice {
    public int Rtd()
    {
        Random randNum = new Random();

        return (randNum.nextInt(6)) + 1;
    }
}
