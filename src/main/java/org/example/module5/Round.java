package org.example.module5;

abstract class Round implements Shape {

    static final double PI = 3.14159;
    public int internalRadius;

    @Override
    public double getSquare() {
        return internalRadius*internalRadius*PI;
    }
}
