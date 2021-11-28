package com.homework.daniel.furniturefactory.Model;

public class Chair extends Furniture implements Draw{

    private int numberOfLegs;

    public Chair(int length, int width, int height, Color color, int numberOfLegs) {
        super(length, width, height, color);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "numberOfLegs=" + numberOfLegs +
                "} " + super.toString();
    }

    @Override
    public boolean draw(){
        System.out.println("  i______i");
        System.out.println("  I______I");
        System.out.println("  I      I");
        System.out.println("  I______I");
        System.out.println(" /      /I");
        System.out.println("(______( I");
        System.out.println("I I    I I");
        System.out.println("I      I");

        return true;
    }
}
