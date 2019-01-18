package com.Steve;

public class Car extends Vehicle {

    private String confirmVehicle;
    private String carGasElectricOther;

    private int gears;
    private int gasMilesTotal;
    private int electricMilesTotal;
    private int otherMilesTotal;

    private Advertisement advertisement;  // Trying composition


    public Car(String typeOfVehicle, Advertisement advertisement) {
        super(typeOfVehicle);
        this.advertisement = advertisement;
    }

    public Car(String typeOfVehicle, String carGasElectricOther) {
        super(typeOfVehicle);
        if(typeOfVehicle.equalsIgnoreCase("car")){
            System.out.println("Confirmed Vehicle type: " + typeOfVehicle.substring(0, 1).toUpperCase() + typeOfVehicle.substring(1));
            this.confirmVehicle = getTypeOfVehicle();
        }else{
            System.out.println("Unconfirmed vehicle for Car class. User entered: " + typeOfVehicle.substring(0, 1).toUpperCase() + typeOfVehicle.substring(1) + " should be car");
        }
        this.carGasElectricOther = carGasElectricOther;

        this.gears = gears;

        this.gasMilesTotal = gasMilesTotal;
        this.electricMilesTotal = electricMilesTotal;
        this.otherMilesTotal = otherMilesTotal;

    }
    public String getConfirmVehicle() {
        return confirmVehicle;
    }

    public String getCarGasElectricOther() {
        return carGasElectricOther;
    }

    public int carMovement(int speed){
        if(speed<0 || speed>200){
            System.out.println("Invalid speed -> MPH range is 0-200");
        }else if(speed==0){
            return this.gears = 1;
        }else if(speed > 45){
            return this.gears = 4;
        }else if(speed > 30){
            return this.gears = 3;
        }else if(speed > 15){
            return this.gears = 2;
        }else if(speed > 0){
            return this.gears = 1;
        }
        return this.gears = 1;
    }

    // unable to pass the value from Gas class method gasMilesDriven into milesDriven
    // the print out works but return this.gasMilesTotal += totalMiles doesn't increase

    public int milesDriven(int totalMiles, String enterGasElectricOrOther) {

        if (enterGasElectricOrOther.equalsIgnoreCase("gas")) {
            System.out.println("Gas entered");
            System.out.println("Total miles: " + totalMiles);
            return this.gasMilesTotal += totalMiles;
        } else if (enterGasElectricOrOther.equalsIgnoreCase("electric")) {
            System.out.println("Electric entered");
            return this.electricMilesTotal += totalMiles;
        } else {
            System.out.println("Other entered");
            return this.otherMilesTotal += totalMiles;
        }
    }

    public int getGears() {
        return gears;
    }

    public int getGasMilesTotal() {
        return gasMilesTotal;
    }

    public int getElectricMilesTotal() {
        return electricMilesTotal;
    }

    public int getOtherMilesTotal() {
        return otherMilesTotal;
    }

    public void startedCar(){
        System.out.println("Car started");
    }

    public void testAdverstisement(){
        getAdvertisement();

    }

    public Advertisement getAdvertisement() {
        return advertisement;
    }
}
