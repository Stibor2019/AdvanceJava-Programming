package org.example.four.generic;

import org.example.three.two.collection.Person;

public class BoxDemo {
    public static void main(String[] args){
    Box<Double> aldenovaKutija= new Box<>();
    aldenovaKutija.setPolje(23.5);


    NumberBox<Double> aldenovaKutija2= new NumberBox<>();
    aldenovaKutija2.setNumber(23.5);

    Box<String> dejlinaKutija= new Box<>();
    dejlinaKutija.setPolje("Dejla");

    NumberBox<Integer>dejlinaKutija2= new NumberBox<>();
    dejlinaKutija2.setNumber(24);

    Person person= new Person();
    Box<Person> kenanovaKutija= new Box<>();
    kenanovaKutija.setPolje(person);

     NumberBox<Float>numberBox= new NumberBox<>();
    numberBox.setNumber(23.5F);
    }
}
