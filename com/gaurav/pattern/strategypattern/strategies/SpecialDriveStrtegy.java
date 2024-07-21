package com.gaurav.pattern.strategypattern.strategies;

public class SpecialDriveStrtegy implements DriveStrategy{


    @Override
    public void drive() {
        System.out.println("Special Drive Capabilities");
    }
}
