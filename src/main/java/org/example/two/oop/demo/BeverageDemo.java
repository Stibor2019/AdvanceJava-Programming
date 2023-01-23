package org.example.two.oop.demo;

import org.example.two.oop.Espresso;
import org.example.two.oop.MilkDecorator;
import org.example.two.oop.Tea;

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
