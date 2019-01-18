package com.Steve;

public class Advertisement {

    private boolean promotion;

    public Advertisement(boolean promotion) {
        this.promotion = promotion;
    }

    public boolean isPromotion() {
        System.out.println("Car promotion");
        return promotion;
    }

    public boolean promotionBudget(boolean budgetSet) {
        if (budgetSet) {
            System.out.println("A budget has been set for Car promotion via Advertisement class");
            return true;
        } else {
            System.out.println("A budget has NOT been set for Car promotion via Advertisement class");
            return false;
        }
    }
}
