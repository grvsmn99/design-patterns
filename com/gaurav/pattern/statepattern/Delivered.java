package com.gaurav.pattern.statepattern;

public class Delivered implements PackageState{
    @Override
    public void next(Package pkg) {
        System.out.println("Package is already delivered");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new Shipped());
    }

    @Override
    public void printStatus() {
        System.out.println("Package is already delivered");
    }
}
