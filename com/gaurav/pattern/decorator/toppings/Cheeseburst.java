package com.gaurav.pattern.decorator.toppings;

import com.gaurav.pattern.decorator.pizaas.BasePizza;

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
