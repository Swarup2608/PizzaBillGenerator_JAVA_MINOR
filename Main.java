package com.pizzaBillGenerator;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------------------------------");
        System.out.println("------------ PiZZA 1 -------------");
        System.out.println("----------------------------------\n");
        Pizza basePizza = new Pizza(true);
        basePizza.pizzaPrice();
        basePizza.extraToppings();
        basePizza.extraCheese();
        basePizza.TakeAway();
        basePizza.getBill();

        System.out.println("\n----------------------------------");
        System.out.println("------------ PiZZA 2 -------------");
        System.out.println("----------------------------------\n");
        DeluxPizza dp = new DeluxPizza(true);
        dp.pizzaPrice();
        dp.getBill();
    }
}