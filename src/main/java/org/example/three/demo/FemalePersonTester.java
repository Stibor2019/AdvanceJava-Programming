package org.example.three.demo;

import org.example.one.Gender;
import org.example.three.two.collection.Person;

public class FemalePersonTester implements PersonsTester{
    @Override
    public boolean test(Person person) {
        boolean  test = person.getGender().equals(Gender.FEMALE);
        return test;
    }
}
