package org.example.module5;

abstract class Rectangular implements Shape {

    public int length;

    @Override
    public double getSquare() {
        return length*length;
    }
}
