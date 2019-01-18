package com.Steve;

public class GasCar extends Car {

    private boolean gasCar;

    private int miles;
    private int fuelLevel;

    public GasCar(String typeOfVehicle, String carGasElectricOther, int miles, int fuelLevel) {
        super(typeOfVehicle, carGasElectricOther);
        this.miles = miles;
        this.fuelLevel = fuelLevel;
    }

    public GasCar(String typeOfVehicle, String carGasElectricOther) {
        super(typeOfVehicle, carGasElectricOther);

        if (carGasElectricOther.equalsIgnoreCase("gas") || carGasElectricOther.equalsIgnoreCase("gas car")) {
            this.gasCar = true;
        } else {
            this.gasCar = false;
        }
        System.out.println("Confirmed gas car: " + isGasCar());
    }

    public boolean isGasCar() {
        return gasCar;
    }

    public void driving(boolean keyFob, boolean footOnBrake, boolean pushStarter) {
        if (keyFob && footOnBrake && pushStarter) {
            startedCar();
        } else {
            System.out.println("Car is not in drive mode");
        }
    }

    public int acceleration(int speed){
        System.out.println("Testing acceleration(int speed) GasCar class - return carMovement(speed) Car class");
        System.out.println(super.getGears());
        return carMovement(speed);
    }

    @Override
    public int getGears() {
        return super.getGears();
    }


    public int gasMilesDriven(int totalMiles, String enterGasElectricOrOther) {
        return milesDriven(totalMiles, enterGasElectricOrOther);
    }

    public static void odometer(int odometerGauge){

    }

    public int getMiles() {
        return miles;
    }
}
