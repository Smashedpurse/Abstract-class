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
        System.out.println("The area of the rectangle is: " + r.calculateArea());

        //APPLICATION OF THE SUBCLASS USING A METHOD PROVIDED BY A ABSTRACT CLASS
        Circule c = new Circule();
        c.setRadius(3);
        System.out.println("The area of the circle is: " + c.calculateArea());






    }
}