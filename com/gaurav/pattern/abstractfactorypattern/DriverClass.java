package com.gaurav.pattern.abstractfactorypattern;

import com.gaurav.pattern.abstractfactorypattern.factory.BMWFactory;
import com.gaurav.pattern.abstractfactorypattern.factory.CarFactory;
import com.gaurav.pattern.abstractfactorypattern.factoryproducer.FactoryProducer;
import com.gaurav.pattern.abstractfactorypattern.product.Car;

public class DriverClass {

    public static void main(String[] args) {

        CarFactory bmwFactory = FactoryProducer.getFactory("bmw");
        Car s_1Car = bmwFactory.makeCar("s-1");
        s_1Car.driveCar();

        CarFactory marutiFacory = FactoryProducer.getFactory("maruti");
        Car invicto = marutiFacory.makeCar("invicto");
        invicto.driveCar();


    }
}
