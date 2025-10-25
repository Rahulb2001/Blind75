package org.example.Decorator;

public class MilkDecorator implements Coffee{

    Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", MilkDecorator";
    }

    @Override
    public double cost() {
        return coffee.cost() + 1.5; // Adding cost of milk
    }

}
