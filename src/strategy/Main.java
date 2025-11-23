package strategy;

import strategy.strategies.NormalDrive;
import strategy.strategies.SportsDrive;
import strategy.vehicle.OffReoadVehicle;
import strategy.vehicle.SportsVehicle;
import strategy.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {

        // Strategy Design Pattern
        Vehicle offReoadVehicle = new OffReoadVehicle(new NormalDrive());
        offReoadVehicle.drive();

        Vehicle sportsBike = new SportsVehicle(new SportsDrive());
        sportsBike.drive();
    }
}