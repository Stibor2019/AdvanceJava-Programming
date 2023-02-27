package org.example.three.two.oop;

public class Espresso extends Beverage{
    public Espresso() {
        super("Espresso");
    }

    @Override
    protected double cost() {
        return 2;
    }

    @Override
    public void drink() {
        System.out.println("Pijem espresso");
    }
}
