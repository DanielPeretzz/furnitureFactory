package com.homework.daniel.furniturefactory.Model;

public class Bed extends Furniture implements Draw{

    private boolean isADoubleBed = true;

    public Bed(int length, int width, int height, Color color, boolean isADoubleBed) {
        super(length, width, height, color);
        this.isADoubleBed = isADoubleBed;
    }

    public boolean isADoubleBed() {
        return isADoubleBed;
    }

    public void setADoubleBed(boolean ADoubleBed) {
        isADoubleBed = ADoubleBed;
    }


    @Override
    public boolean draw(){
        System.out.println("   ||");
        System.out.println("   ||                   ||");
        System.out.println("||/||___                ||");
        System.out.println("|| /`   )____________||_/|");
        System.out.println("||/___ //_/_/_/_/_/_/||/ |");
        System.out.println("||(___)/_/_/_/_/_/_/_||  |");
        System.out.println("||     |_|_|_|_|_|_|_|| /|");
        System.out.println("||     | | | | | | | ||/||");
        System.out.println("||~~~~~~~~~~~~~~~~~~~||");
        System.out.println("||                   ||");

        return true;
    }
}
