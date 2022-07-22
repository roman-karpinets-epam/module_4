package org.example.module5;

import java.util.Random;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z){ //constructor with parameters
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(){ //constructor without parameters for creating random vectors
        Random rd = new Random();
        x = rd.nextInt() + rd.nextDouble();
        y = rd.nextInt() + rd.nextDouble();
        z = rd.nextInt() + rd.nextDouble();
    }

    public double calculateVectorLength () {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public static double calculateDotProduct (Vector v1, Vector v2) {
        return v1.x*v2.x + v1.y*v2.y + v1.z*v2.z;
    }

    public static double calculateDotProduct () { //overloaded method uses random vectors if it's called without arguments
        Vector v1 = new Vector();
        Vector v2 = new Vector();
        return v1.x*v2.x + v1.y*v2.y + v1.z*v2.z;
    }

    public static Vector[] createRandomVectorsArray(int numberOfElements){
        Vector[] arr = new Vector[numberOfElements];
        for(int i = 0; i < numberOfElements; i++){
            arr[i] = new Vector();
        }
        return arr;
    }


    public void getVectorParameters(){ //just extra method to check vector's parameters
        System.out.format("x = %f y = %f z = %f%n", this.x, this.y, this.z);
    }
}
