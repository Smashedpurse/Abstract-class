package com.cofacademy.example;

public class Circule extends Figure{

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        double result = Math.pow(radius,2) * 3.1416;

        return result;
    }
}
