package com.gaurav.pattern.strategypattern.strategies;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive Noramally");
    }
}
