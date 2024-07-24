package com.gaurav.pattern.facadepattern.complexsystem;

public class SoundSystem {
    public void on(){
        System.out.println("Sound system ON");
    }

    public void off(){
        System.out.println("Sound system OFF");
    }

    public void setVolume(int volume){
        System.out.println("set sound volume to "+volume);
    }
}
