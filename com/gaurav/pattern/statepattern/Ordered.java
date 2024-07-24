package com.gaurav.pattern.statepattern;

public class Ordered implements PackageState{
    @Override
    public void next(Package pkg) {
        pkg.setState(new Shipped());
    }

    @Override
    public void prev(Package pkg) {
        System.out.println("This is the root state");
    }

    @Override
    public void printStatus() {
        System.out.println("Package Ordered, Not shipped yet");
    }
}
