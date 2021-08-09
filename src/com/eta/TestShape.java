package com.eta;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        shape.run();
    }
}

interface ColourFilter{
    void colourCode();
}

interface TestData{
    void dark();
}


abstract class Shape{
    abstract void run();
    void eat(){
        System.out.println("Eating...........!!!");
    }
}

class Rectangle extends Shape{
    void run(){
        System.out.println("Rectangle.....!!!");
    }
}

class Circle implements ColourFilter, TestData{
    public void colourCode() {

    }
    public void dark() {

    }
}