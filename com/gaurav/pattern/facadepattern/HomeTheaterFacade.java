package com.gaurav.pattern.facadepattern;

import com.gaurav.pattern.facadepattern.complexsystem.DVDPlayer;
import com.gaurav.pattern.facadepattern.complexsystem.Projector;
import com.gaurav.pattern.facadepattern.complexsystem.Screen;
import com.gaurav.pattern.facadepattern.complexsystem.SoundSystem;

public class HomeTheaterFacade {

    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private Screen screen;

    public HomeTheaterFacade(DVDPlayer dvdPlayer, Projector projector, SoundSystem soundSystem, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.screen = screen;
    }

    public void watchMovie(String movieName, int volume){
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        projector.getSource("DVD Player");
        soundSystem.on();
        soundSystem.setVolume(volume);
        dvdPlayer.on();
        dvdPlayer.play(movieName);
    }

    public void turmOffSystem(){
        System.out.println("Shutting movie theater down...");
        dvdPlayer.off();
        soundSystem.off();
        projector.off();
        screen.up();
    }
}
