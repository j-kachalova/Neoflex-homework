package com.kachalova.factory;

public class CoffeeMachine {
    public void makeCoffee(CoffeeType coffeeType){
        Coffee coffee = CoffeeFactory.getCoffee(coffeeType);
        System.out.println("start making coffee");
        addWater(coffee);
        addBeans();
        boilWater();
    }
    private void addWater(Coffee coffee) {
        System.out.println("add " + coffee.addingWater() + "ml of water");
    }

    private void addBeans() {
        System.out.println("add coffee");
    }

    private void boilWater() {
        System.out.println("boil water");
    }
}
