package com.Steve;

public class BasicBurger {
    private String burgerName;
    private double basePrice = 2.00;
    private String rollType;
    private String meat;
    private String lettuce;
    private double lettuceCost;
    private String tomato;
    private double tomatoCost;
    private String onions;
    private double onionsCost;
    private String cheese;
    private double cheeseCost;
    private double addedCost;


    public BasicBurger(String burgerName, double basePrice, String rollType, String meat) {
        this.burgerName = burgerName;
        if (basePrice != 2.00) {
            System.out.println("Invalid price entered -> " + basePrice + " Burger set price " + this.basePrice);
        } else {
            //System.out.println("Base burger: " + basePrice);
            this.basePrice = basePrice;
        }

        this.rollType = rollType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.lettuceCost = .12;
        this.tomato = tomato;
        this.tomatoCost = .22;
        this.onions = onions;
        this.onionsCost = .32;
        this.cheese = cheese;
        this.cheeseCost = .42;
        this.addedCost = 0;

    }

    public void addedItems(String lettuce, String tomato, String onions, String cheese) {
        this.addedCost = this.getBasePrice();

        this.lettuce = "No lettuce";
        if(lettuce == "yes") {
            this.lettuce = "Lettuce added for an extra " + this.lettuceCost;
            this.addedCost +=  this.lettuceCost;
        }

        this.tomato = "No tomato";
         if (tomato == "yes") {
             this.tomato = "Tomato added for an extra " + this.tomatoCost;
             this.addedCost += this.tomatoCost;
        }
        this.onions = "No onions";
        if (onions == "yes") {
            this.onions = "Tomato added for an extra " + this.onionsCost;
            this.addedCost += this.onionsCost;
        }
        this.cheese = "No cheese";
        if (cheese == "yes") {
            this.cheese = "Tomato added for an extra " + this.cheeseCost;
            this.addedCost += this.cheeseCost;
        }

        System.out.println(this.lettuce + " \n"  + this.tomato + " \n" + this.onions + " \n" + this.cheese + "\n"
                + "Base price: " + getBasePrice() + " With extras total: "+ this.addedCost);

    }

    public String getBurgerName() {
        return burgerName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getAddedCost() {
        return addedCost;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getLettuce() {
        return lettuce;
    }

    public double getLettuceCost() {
        return lettuceCost;
    }

    public String getTomato() {
        return tomato;
    }

    public double getTomatoCost() {
        return tomatoCost;
    }

    public String getOnions() {
        return onions;
    }

    public double getOnionsCost() {
        return onionsCost;
    }

    public String getCheese() {
        return cheese;
    }

    public double getCheeseCost() {
        return cheeseCost;
    }
}
