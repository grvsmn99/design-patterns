package com.gaurav.pattern.decoratorpattern.toppings;

import com.gaurav.pattern.decoratorpattern.pizaas.BasePizza;

public class Paneer extends Topping{

    BasePizza pizza;

    public Paneer(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost()+15.0;
    }
}
