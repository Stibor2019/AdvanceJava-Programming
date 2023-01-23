package org.example.two.oop;

public class BosnianCaffe extends  Beverage{
    public BosnianCaffe() {
        super("Bosnaska kafa");
    }

    @Override
    public double cost() {
        return 2.3;
    }

    @Override
    public void drink() {
        System.out.println("Bosnian Caffe se ćejfi...");
    }
}
