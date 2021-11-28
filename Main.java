package com.homework.daniel.furniturefactory;


import com.homework.daniel.furniturefactory.Model.*;

import java.util.Random;


public class Main {

    // create object
    public static Random random = new Random();
    static Chair chair = new Chair(random.nextInt(10), random.nextInt(10), random.nextInt(10),
            Color.WHITE,4);
    static Table table = new Table(random.nextInt(10), random.nextInt(10), random.nextInt(10),
    Color.WHITE, 4);
    static Bed bed = new Bed(random.nextInt(10), random.nextInt(10), random.nextInt(10),
    Color.WHITE, true);



    public static void main(String[] args) {
        // Apply the method in main function
        printArray(createArray());
    }




    // Factory Method creates Array and print
    public static Furniture[] createArray() {
        Furniture[] furniture = new Furniture[20];
        for (int i = 0; i < furniture.length; i++) {
            if (random.nextInt(4) == 0) {
                furniture[i] = new Chair(random.nextInt(10), random.nextInt(10), random.nextInt(10),
                        Color.WHITE, 4);
            } else if (random.nextInt(4) == 1) {
                furniture[i] = new Table(random.nextInt(10), random.nextInt(10), random.nextInt(10),
                        Color.WHITE, 4);
            } else if (random.nextInt(4) == 2) {
                furniture[i] = new Bed(random.nextInt(10), random.nextInt(10), random.nextInt(10),
                        Color.WHITE, true);
            }
        }
        return furniture;
    }
    public static void printArray(Furniture[] furnitures ){
        for (int i = 0; i <furnitures.length ; i++) {
            if (furnitures[i] instanceof Chair){
                System.out.println(furnitures[i]);
                System.out.println(chair.draw());
            }
            else if(furnitures[i] instanceof Table){
                System.out.println(furnitures[i]);
                System.out.println(table.draw());
            }
            else if(furnitures[i] instanceof Bed){
                System.out.println(furnitures[i]);
                System.out.println(bed.draw());
            }

        }
    }


}
