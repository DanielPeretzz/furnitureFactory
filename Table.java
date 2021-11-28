package com.homework.daniel.furniturefactory.Model;

public class Table extends Furniture implements Draw{

    private int numberOfSeats;

    public Table(int length, int width, int height, Color color, int numberOfSeats) {
        super(length, width, height, color);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Table{" +
                "numberOfSeats=" + numberOfSeats +
                "} " + super.toString();
    }

    @Override
    public boolean draw(){
        System.out.println("   =====================");
        System.out.println("  /                   /");
        System.out.println(" /                   /|");
        System.out.println("===================== |");
        System.out.println(" | |               |  |");
        System.out.println(" | |               |  |");
        System.out.println(" | |               |  |");
        System.out.println(" |                 |");
        System.out.println(" |                 |");
        System.out.println(" |                 |");
        return true;
    }
}
