package strategy.vehicle;

import strategy.strategies.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        System.out.println(this.getClass().getSimpleName() + ": ");
        driveStrategy.drive();
    }
}
