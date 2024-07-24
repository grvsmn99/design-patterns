package com.gaurav.pattern.statepattern;

public class DriverClass {

    public static void main(String[] args) {
        Package pkg = new Package();

        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.nextState();
        pkg.printStatus();

        pkg.previousState();
        pkg.printStatus();

    }
}
