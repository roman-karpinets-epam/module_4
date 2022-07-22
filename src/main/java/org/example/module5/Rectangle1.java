package org.example.module5;

public class Rectangle1 extends Rectangular{
    private int width;
    public Rectangle1(int length, int width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getSquare() {
        return length*width;
    }
}
