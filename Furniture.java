package com.homework.daniel.furniturefactory.Model;

public  class Furniture {
    private int length;
    private int width;
    private int height;
    private Color color;

    public Furniture(int length, int width, int height, Color color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color=" + color +
                '}';
    }





}
