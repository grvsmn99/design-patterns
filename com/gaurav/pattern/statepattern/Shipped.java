package com.gaurav.pattern.statepattern;

public class Shipped implements PackageState{
    @Override
    public void next(Package pkg) {
        pkg.setState(new Delivered());
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new Ordered());
    }

    @Override
    public void printStatus() {
        System.out.println("Current state is : Shipped");
    }
}
