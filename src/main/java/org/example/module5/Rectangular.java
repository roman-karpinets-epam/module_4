package org.example.module5;

abstract class Rectangular implements Shape {
    public int Side1;

    @Override
    public double getSquare() {
        return Side1*Side1;
    }
}
