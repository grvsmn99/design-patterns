package com.gaurav.pattern.facadepattern.complexsystem;

public class Projector {
    public void on(){
        System.out.println("Projector  ON");
    }

    public void off(){
        System.out.println("Projector OFF");
    }

    public void getSource (String input){
        System.out.println("Input source is "+input);
    }
}
