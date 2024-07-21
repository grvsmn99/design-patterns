package com.gaurav.pattern.strategypattern.strategyuser;

import com.gaurav.pattern.strategypattern.strategies.DriveStrategy;

public class Vehical {

    DriveStrategy driveStrategy;

    public Vehical(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
