package org.example.three.two.oop.demo;

import org.example.three.two.oop.Espresso;
import org.example.three.two.oop.MilkDecorator;
import org.example.three.two.oop.Tea;

public class BeverageDemo {
    public static void main(String[] args) {

    //filereader

     Espresso espresso = new Espresso();

     //bufferesreader
     MilkDecorator milkDecorator= new MilkDecorator(espresso);
     milkDecorator.drink();
     milkDecorator.print();

     espresso.drink();
     espresso.print();

     Tea tea= new Tea();
      tea.drink();
      tea.print();

      MilkDecorator beverage = new MilkDecorator(tea);
      beverage.drink();
      beverage.print();

   //  System.out.println(beverage.cost());
    }
}
