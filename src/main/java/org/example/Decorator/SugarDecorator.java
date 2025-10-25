package org.example.Decorator;

public class SugarDecorator implements Coffee {

    Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", SugarDecorator";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5; // Adding cost of sugar
    }
}
