package com.cofacademy.example;
public class Rectangule extends Figure{

    //DECLARATION OF VARIABLES
    private double base;
    private double large;

    //DECLARATION OF THE SETTER FOR THE BASE
    public void setBase(double base) {
        this.base = base;
    }
    //DECLARATION OF THE SETTER FOR THE LARGE
    public void setLarge(double large) {
        this.large = large;
    }

    //OVERRIDE OF THE METHOD calculareArea PROVIDED BY THE ABSTRACT CLASS FIGURE
    @Override
    public double calculateArea() {
        double result = base * large;
        return result;
    }
}

