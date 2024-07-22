package com.gaurav.pattern.abstractfactorypattern.factoryproducer;

import com.gaurav.pattern.abstractfactorypattern.factory.BMWFactory;
import com.gaurav.pattern.abstractfactorypattern.factory.CarFactory;
import com.gaurav.pattern.abstractfactorypattern.factory.MarutiFactory;

public class FactoryProducer {
    public static CarFactory getFactory(String brand){
        switch (brand){
            case "bmw" : return new BMWFactory();
            case "maruti" : return new MarutiFactory();
            default: return null;
        }
    }
}
