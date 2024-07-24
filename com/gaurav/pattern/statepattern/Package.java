package com.gaurav.pattern.statepattern;

public class Package {
    private PackageState state = new Ordered();

    public void setState (PackageState state){
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void previousState() {
        state.prev(this);
    }


    public void printStatus() {
        state.printStatus();
    }
}
