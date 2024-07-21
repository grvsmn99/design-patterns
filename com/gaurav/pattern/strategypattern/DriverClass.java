package com.gaurav.pattern.strategypattern;

import com.gaurav.pattern.strategypattern.strategyuser.GoodsVehical;
import com.gaurav.pattern.strategypattern.strategyuser.SportsVehical;
import com.gaurav.pattern.strategypattern.strategyuser.Vehical;

public class DriverClass {

    public static void main(String[] args) {
        Vehical sportsCar = new SportsVehical();
        sportsCar.drive();

        Vehical goodsCar = new GoodsVehical();
        goodsCar.drive();

    }
}
