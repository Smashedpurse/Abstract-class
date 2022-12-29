package com.cofacademy.example;

public class Square extends Figure{
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double result = side * side ;
        return result;
    }
}
