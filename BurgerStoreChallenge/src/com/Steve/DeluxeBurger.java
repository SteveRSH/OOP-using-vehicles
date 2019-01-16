package com.Steve;

import java.text.DecimalFormat;

public class DeluxeBurger extends BasicBurger {
    private double deluxeBurgerExtra = 1.97;
    private String chips;
    private double chipsCost = 1.03;
    private String soda;
    private double allSodaCost = 1.77;

    public DeluxeBurger(double basePrice, String rollType, String meat) {
        super("Deluxe Burger", basePrice, rollType, meat);

        this.deluxeBurgerExtra = deluxeBurgerExtra;
        this.chips = chips;
        this.chipsCost = chipsCost;
        this.soda = soda;
        this.allSodaCost = allSodaCost;
    }

    public void orderDeluxeBurger(String deluxeSpecial){
        DecimalFormat df = new DecimalFormat("#.00");
        double deluxeSpecialCost = deluxeBurgerExtra + getBasePrice() + this.allSodaCost + this.chipsCost;
        double combineSodaAndChipsCost = this.allSodaCost+this.chipsCost;

        if(deluxeSpecial=="yes"){
            System.out.println("Base price: "+ super.getBasePrice());
            System.out.println("Soda: " + this.allSodaCost + " and chips: " + this.chipsCost + " Total: " + df.format(combineSodaAndChipsCost));
            System.out.println("Total cost: " + df.format(deluxeSpecialCost));
        }else{
            System.out.println("Deluxe burger not order");
        }

    }

    public double getDeluxeBurgerExtra() {
        return deluxeBurgerExtra;
    }

    public String getChips() {
        return chips;
    }

    public double getChipsCost() {
        return chipsCost;
    }

    public String getSoda() {
        return soda;
    }

    public double getAllSodaCost() {
        return allSodaCost;
    }

    @Override
    public String getLettuce() {
        return "Lettuce is not available for the deluxe special.";
    }

    @Override
    public String getTomato() {
        return "Tomato is not available for the deluxe special.";
    }

    @Override
    public String getOnions() {
        return "Onions is not available for the deluxe special.";
    }

    @Override
    public String getCheese() {
        return "Cheese is not available for the deluxe special.";
    }
}

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.


