package com.pizzaBillGenerator;

public class Pizza {
    private int price;
    private boolean veg;

    public Pizza(boolean veg) {
        this.veg = veg;
        if(this.veg)
            this.price = 300;
        else
            this.price = 400;
    }

    public  void pizzaPrice(){
        System.out.println("Pizza Price : "+this.price);
    }

    public void extraCheese(){
        System.out.println("Cheese : 100/-");
        this.price+=100;
    }

    public void extraToppings(){
        System.out.println("Toppings : 150/-");
        this.price+=150;
    }

    public void TakeAway(){
        System.out.println("Take away : 20/-");
        this.price+=30;
    }


    public void getBill(){
        System.out.println("Overall Price is : "+this.price+"/-");
    }
}
