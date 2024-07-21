package com.gaurav.pattern.strategypattern.strategyuser;

import com.gaurav.pattern.strategypattern.strategies.DriveStrategy;
import com.gaurav.pattern.strategypattern.strategies.SpecialDriveStrtegy;

public class SportsVehical extends Vehical{

    public SportsVehical(){
        super(new SpecialDriveStrtegy());
    }
}
