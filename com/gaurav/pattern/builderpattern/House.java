package com.gaurav.pattern.builderpattern;

public class House {
    // required parameters
    private String foundation;
    private String structure;

    // optional parameters
    private boolean hasGarden;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private int numberOfFloors;

    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.hasGarden = builder.hasGarden;
        this.hasGarage = builder.hasGarage;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.numberOfFloors = builder.numberOfFloors;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure + ", hasGarden=" + hasGarden
                + ", hasGarage=" + hasGarage + ", hasSwimmingPool=" + hasSwimmingPool + ", numberOfFloors="
                + numberOfFloors + "]";
    }

    // Builder Class
    public static class HouseBuilder {
        // required parameters
        private String foundation;
        private String structure;

        // optional parameters
        private boolean hasGarden;
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private int numberOfFloors;

        public HouseBuilder(String foundation, String structure) {
            this.foundation = foundation;
            this.structure = structure;
        }

        public HouseBuilder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public HouseBuilder setNumberOfFloors(int numberOfFloors) {
            this.numberOfFloors = numberOfFloors;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}

