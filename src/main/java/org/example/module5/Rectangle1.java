package org.example.module5;

public class Rectangle1 extends Rectangular{
    private int Side2;
    public Rectangle1(int Side1, int Side2){
        this.Side1 = Side1;
        this.Side2 = Side2;
    }

    @Override
    public double getSquare() {
        return Side1*Side2;
    }
}
