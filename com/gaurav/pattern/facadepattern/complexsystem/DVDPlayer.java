package com.gaurav.pattern.facadepattern.complexsystem;

public class DVDPlayer {

    public void on(){
        System.out.println("DVD Player ON");
    }

    public void play(String movie){
        System.out.println("DVD is playing "+movie);
    }

    public void off(){
        System.out.println("DVD Player OFF");
    }
}
