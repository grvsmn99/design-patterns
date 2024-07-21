package com.gaurav.pattern.decoratorpattern.toppings;

import com.gaurav.pattern.decoratorpattern.pizaas.BasePizza;

public class Cheeseburst extends Topping {

    private BasePizza pizza;

    public Cheeseburst(BasePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return pizza.cost()+20.0;
    }
}
