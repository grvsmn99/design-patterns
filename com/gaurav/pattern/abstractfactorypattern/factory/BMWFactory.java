package com.gaurav.pattern.abstractfactorypattern.factory;

import com.gaurav.pattern.abstractfactorypattern.product.Car;
import com.gaurav.pattern.abstractfactorypattern.product.S_1;
import com.gaurav.pattern.abstractfactorypattern.product.S_2;

public class BMWFactory implements CarFactory{
    @Override
    public Car makeCar(String model) {
        switch (model){
            case "s-1" : return new S_1();
            case "s-2" : return new S_2();
            default: return null;
        }
    }
}
