package com.gaurav.pattern.decoratorpattern.toppings;

import com.gaurav.pattern.decoratorpattern.pizaas.BasePizza;

public abstract class Topping extends BasePizza {
    public abstract double cost();
}
