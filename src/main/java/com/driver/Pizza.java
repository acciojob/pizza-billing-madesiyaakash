package com.driver;

public class Pizza {
    protected boolean isVeg;
    protected int basePrice;
    protected int extraCheesePrice;
    protected int extraToppingsPrice;
    protected int paperBagPrice;
    protected int totalPrice;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400;
        this.extraCheesePrice = 80;
        this.extraToppingsPrice = isVeg ? 70 : 120;
        this.paperBagPrice = 20;
    }

    public void addExtraCheese() {
        totalPrice += extraCheesePrice;
    }

    public void addExtraToppings() {
        totalPrice += extraToppingsPrice;
    }

    public void addPaperBag() {
        totalPrice += paperBagPrice;
    }

    public void generateBill() {
        System.out.println("Base Price Of The Pizza: " + basePrice);
        System.out.println("Extra Cheese Added: " + (totalPrice - basePrice));
        if (!isVeg) {
            System.out.println("Extra Toppings Added: " + (totalPrice - basePrice - extraCheesePrice));
        }
        System.out.println("Total Price: " + totalPrice);
        System.out.println();
    }
}