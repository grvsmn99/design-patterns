package com.gaurav.pattern.factorypattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DriverClass {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String shapeStr = null;
        while(!"exit".equalsIgnoreCase(shapeStr)) {
            System.out.println("\n\nEnter which shape you want? (circle, triangle,square) \nenter exit to exit from code");
            shapeStr = br.readLine();
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape = shapeFactory.getShape(shapeStr);
            shape.draw();
        }
        br.close();
    }
}
