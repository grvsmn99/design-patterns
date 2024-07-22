package com.gaurav.pattern.abstractfactorypattern.factory;

import com.gaurav.pattern.abstractfactorypattern.product.Car;

public interface CarFactory {

    Car makeCar(String model);
}
