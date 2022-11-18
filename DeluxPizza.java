package com.pizzaBillGenerator;

public class DeluxPizza extends Pizza{
    public DeluxPizza(boolean veg){
        super(veg);
        super.extraCheese();
        super.extraToppings();
    }
}
