package org.example.three.two.oop.demo;

import org.example.three.two.oop.Beverage;

public class IrishDecorator extends Beverage {
    private  Beverage beverage;
    public IrishDecorator(Beverage beverage) {
        super("baylies");
        this.beverage = beverage;
    }

    @Override
    protected double cost() {
        return 5;
    }

    @Override
    public void drink() {
        System.out.println(beverage.getName() + "s baylies pijem...");
    }
}
