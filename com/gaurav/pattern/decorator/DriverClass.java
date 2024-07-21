package com.gaurav.pattern.decorator;

import com.gaurav.pattern.decorator.pizaas.BasePizza;
import com.gaurav.pattern.decorator.pizaas.Farmhouse;
import com.gaurav.pattern.decorator.pizaas.Margrita;
import com.gaurav.pattern.decorator.toppings.Cheeseburst;
import com.gaurav.pattern.decorator.toppings.Paneer;

public class DriverClass {

    public static void main(String[] args) {
        //Make a margrita Paneer Pizza;
        BasePizza margritaPaneerPizza = new Paneer(new Margrita());
        System.out.println("margrita Paneer Pizza cost= "+margritaPaneerPizza.cost());

        //Make a farmhouse Paneer cheezseburst pizza
        BasePizza farmhousePaneerCheezseburstPizza = new Paneer( new Cheeseburst( new Farmhouse()));
        System.out.println("farmhouse cheezeburst Paneer Pizza cost= "+farmhousePaneerCheezseburstPizza.cost());
    }
}
