package com.cofacademy.example;

public class Main {
    public static void main(String[] args) {

        //APPLICATION OF THE SUBCLASS USING A METHOD PROVIDED BY A ABSTRACT CLASS
        Square s = new Square ();
        s.setSide(23);
        System.out.println("The area of the square is: " + s.calculateArea());

        //APPLICATION OF THE SUBCLASS USING A METHOD PROVIDED BY A ABSTRACT CLASS
        Rectangule r = new Rectangule();
        r.setBase(10);
        r.setLarge(2);
        r.calculateArea();
        System.out.println("The area of the rectangule is: " + r.calculateArea());









    }
}