package org.example.module5;

public class Oval extends Round{
    private int Radius2;
    public Oval(int Radius1, int Radius2){
        this.Radius1 = Radius1;
        this.Radius2 = Radius2;
    }

    @Override
    public double getSquare() {
        return Radius1*Radius2*PI;
    }
}
