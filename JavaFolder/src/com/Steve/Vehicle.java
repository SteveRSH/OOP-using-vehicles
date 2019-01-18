package com.Steve;

public class Vehicle {

    private String typeOfVehicle;


    public Vehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle.substring(0, 1).toUpperCase() + typeOfVehicle.substring(1);
    }

    public String getTypeOfVehicle() {
        // First letter will always be uppercase
        // Need to search for a method to use

        return "Vehicle type -> " + typeOfVehicle;


    }
}
