package com.cofacademy.example;

public class Rectangule extends Figure{

    private double base;
    private double large;

    public void setBase(double base) {
        this.base = base;
    }

    public void setLarge(double large) {
        this.large = large;
    }

    @Override
    public double calculateArea() {
        double result = base * large / 2 ;
        return result;
    }
}

