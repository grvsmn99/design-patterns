package com.gaurav.pattern.abstractfactorypattern.factory;

import com.gaurav.pattern.abstractfactorypattern.product.Car;
import com.gaurav.pattern.abstractfactorypattern.product.Invicto;
import com.gaurav.pattern.abstractfactorypattern.product.Swift;

public class MarutiFactory implements CarFactory{
    @Override
    public Car makeCar(String model) {
        switch (model){
            case "swift" : return new Swift();
            case "invicto" : return new Invicto();
            default: return null;
        }
    }
}
