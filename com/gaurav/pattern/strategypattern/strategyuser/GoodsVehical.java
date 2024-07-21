package com.gaurav.pattern.strategypattern.strategyuser;

import com.gaurav.pattern.strategypattern.strategies.DriveStrategy;
import com.gaurav.pattern.strategypattern.strategies.NormalDriveStrategy;

public class GoodsVehical extends Vehical{

    public GoodsVehical() {
        super(new NormalDriveStrategy());
    }
}
