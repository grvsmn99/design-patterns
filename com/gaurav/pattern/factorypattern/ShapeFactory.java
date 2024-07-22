package com.gaurav.pattern.factorypattern;

public class ShapeFactory {


    public Shape getShape(String shape){
        switch (shape){
            case "circle" : return new Circle();
            case "square" : return new Square();
            case "triangle" : return new Triangle();
            default: return null;
        }
    }
}
