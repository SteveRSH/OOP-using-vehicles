package com.Steve;

public class ElectricCar extends Car{

    private boolean electricCar;

    public ElectricCar(String typeOfVehicle, String carGasElectricOther) {
        super(typeOfVehicle, carGasElectricOther);

        if (carGasElectricOther.equalsIgnoreCase("electric")) {
            this.electricCar = true;
        } else {
            this.electricCar = false;
        }
        System.out.println("Confirmed electric car: " + isElectricCar());
    }

    public boolean isElectricCar() {
        return electricCar;
    }

    private void driveMode() {
        System.out.println("Car is not in drive mode");
    }

    public void driving(boolean phoneKeyOrKeyCard, boolean footOnBrake, boolean shiftToGear) {
        if (phoneKeyOrKeyCard && footOnBrake && shiftToGear) {
            startedCar();
        } else {
            driveMode();
        }
    }

    @Override
    public void startedCar() {
        System.out.println("Electric car in drive mode");
    }
}
