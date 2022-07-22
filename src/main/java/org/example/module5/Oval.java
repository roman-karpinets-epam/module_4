package org.example.module5;

public class Oval extends Round{
    private int externalRadius;
    public Oval(int internalRadius, int externalRadius){
        this.internalRadius = internalRadius;
        this.externalRadius = externalRadius;
    }

    @Override
    public double getSquare() {
        return internalRadius*externalRadius*PI;
    }
}
