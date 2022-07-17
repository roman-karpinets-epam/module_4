package org.example.module5;

abstract class Round implements Shape {
    static final double PI = 3.14159;
    public int Radius1;
    @Override
    public double getSquare() {
        return Radius1*Radius1*PI;
    }
}
