package com.Steve;

public class HealthyBurger extends BasicBurger {
    private String guacamole;
    private double guacCost;
    private String rawOnions;
    private double rawOnionsCost;
    private double addedCost;

    public HealthyBurger(String meat, double basePrice) {
        super("Healthy Burger", basePrice, "Brown-rye", meat);

        this.guacamole = guacamole;
        this.guacCost = .52;
        this.rawOnions = rawOnions;
        this.rawOnionsCost = .62;
        this.addedCost = addedCost;
    }

    public void addedItems(String guacamole, String rawOnions) {

        this.addedCost = this.getBasePrice();

        this.guacamole = "No guacamole";
        if (guacamole == "yes") {

            this.guacamole = "Guacamole added for an extra " + this.guacCost;
            this.addedCost += this.guacCost;
        }

        this.rawOnions = "No raw onions";
        if (rawOnions == "yes") {
            this.rawOnions = "Raw onions added for an extra " + this.rawOnionsCost;
            this.addedCost += this.rawOnionsCost;
        }

        System.out.println(this.guacamole + " \n"  + this.rawOnions + " \n"  + "Base price: " + getBasePrice() + " With extras total: "+ this.addedCost);
    }

    public void inAdditionToHealthy(String addLettuce, String addTomato, String addOnions, String addCheese){
        if(addLettuce=="yes"){
            getLettuce();
            System.out.println("New total: " + getLettuceCost());
        }
        if(addTomato=="yes"){
            getTomato();
            System.out.println("New total: " + getTomatoCost());
        }
        if(addOnions=="yes"){
            getOnions();
            System.out.println("New total: " + getOnionsCost());
        }
        if(addCheese=="yes"){
            getCheese();
            System.out.println("New total: " + getCheeseCost());
        }


    }



    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }

    @Override
    public String getLettuce() {
        System.out.println("Adding lettuce to healthy burger");
        super.getLettuceCost();
        return super.getLettuce();
    }
    @Override
    public double getLettuceCost() {
        return super.getLettuceCost() + this.addedCost;
    }


    @Override
    public String getTomato() {
        System.out.println("Adding tomato to healthy burger");
        return super.getTomato();
    }

    @Override
    public double getTomatoCost() {
        return super.getTomatoCost() + this.addedCost;
    }

    @Override
    public String getOnions() {
        System.out.println("Adding onions to healthy burger");
        return super.getOnions();
    }

    @Override
    public double getOnionsCost() {
        return super.getOnionsCost() + this.addedCost;
    }

    @Override
    public String getCheese() {
        System.out.println("Adding cheese to healthy burger");
        return super.getCheese();
    }

    @Override
    public double getCheeseCost() {
        return super.getCheeseCost() + this.addedCost;
    }



    public String getGuacamole() {
        return guacamole;
    }

    public double getGuacCost() {
        return guacCost;
    }

    public String getRawOnions() {
        return rawOnions;
    }

    public double getRawOnionsCost() {
        return rawOnionsCost;
    }
}
