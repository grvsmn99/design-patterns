package com.gaurav.pattern.builderpattern;

public class DriverClass {
    public static void main(String[] args) {
        House house1 = new House.HouseBuilder("Concrete", "Brick")
                .setGarage(true)
                .setGarden(false)
                .setNumberOfFloors(2)
                .setSwimmingPool(false)
                .build();

        House house2 = new House.HouseBuilder("Wood", "Timber")
                .setGarden(false)
                .setGarage(false)
                .setSwimmingPool(true)
                .setNumberOfFloors(1)
                .build();

        System.out.println(house1);
        System.out.println(house2);

    }
}
