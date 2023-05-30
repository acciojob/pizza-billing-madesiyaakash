package com.driver;

public class Main {
  public static void main(String[] args) {
    // Example 1
    Pizza vegPizza = new Pizza(true);
    vegPizza.addExtraCheese();
    vegPizza.addExtraToppings();
    vegPizza.addPaperBag();
    vegPizza.generateBill();

    // Example 2
    Pizza nonVegPizza = new DeluxePizza(false);
    nonVegPizza.addExtraCheese();
    nonVegPizza.addExtraToppings();
    nonVegPizza.generateBill();
  }
}




