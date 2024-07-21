package com.gaurav.pattern.decorator.toppings;

import com.gaurav.pattern.decorator.pizaas.BasePizza;

public abstract class Topping extends BasePizza {
    public abstract double cost();
}
