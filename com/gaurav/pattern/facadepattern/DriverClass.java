package com.gaurav.pattern.facadepattern;

import com.gaurav.pattern.facadepattern.complexsystem.DVDPlayer;
import com.gaurav.pattern.facadepattern.complexsystem.Projector;
import com.gaurav.pattern.facadepattern.complexsystem.Screen;
import com.gaurav.pattern.facadepattern.complexsystem.SoundSystem;

public class DriverClass {
    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        Screen screen = new Screen();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem, screen);

        homeTheater.watchMovie("Inception", 20);
        System.out.println();
        homeTheater.turmOffSystem();
    }
}
