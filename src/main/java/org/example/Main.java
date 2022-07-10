package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //First task
        String s1 = "PHP Exercises and ";
        String s2 = "Python Exercises";
        String result = s1.concat(s2).replaceAll("[eE]", "");
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);
        System.out.println("Concatenated and replaced string: " + result);
        //Second task
        Computer work = new Computer("HP", "1920*1080");
        Computer home = new Computer("Lenovo", "1080*720");
        home.cores = 4;
        work.type = "Laptop";
        //Third task
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
        //Fourth task
        NumberHolder hold = new NumberHolder();
        hold.aFloat = 23.34f;
        hold.anInt = -18;
        System.out.format("Float value is equal to %f, integer value is equal to %d", hold.aFloat, hold.anInt);
        /*Fifth task
        After executing following code
        ...
        String[] students = new String[10];
        String studentName = "Peter Parker";
        students[0] = studentName;
        studentName = null;
        ...
        there will be one reference to first element of students array. There is no objects, eligible for garbage collection.

        Sixth task
        How does a program destroy an object that it creates?
        The program doesn't destroy objects. But if all references to an object has been set to null, it is eligible for garbage collection.
        */
    }
}