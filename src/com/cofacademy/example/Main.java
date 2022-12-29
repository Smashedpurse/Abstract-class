package com.cofacademy.example;

public class Main {
    public static void main(String[] args) {
        Square s = new Square ();
        //s.display();

        s.setSide(23);

        System.out.println("The area of the square is: " + s.calculateArea());



    }
}