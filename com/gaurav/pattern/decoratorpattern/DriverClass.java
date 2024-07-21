package com.gaurav.pattern.decoratorpattern;

import com.gaurav.pattern.decoratorpattern.pizaas.BasePizza;
import com.gaurav.pattern.decoratorpattern.pizaas.Farmhouse;
import com.gaurav.pattern.decoratorpattern.pizaas.Margrita;
import com.gaurav.pattern.decoratorpattern.toppings.Cheeseburst;
import com.gaurav.pattern.decoratorpattern.toppings.Paneer;

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
