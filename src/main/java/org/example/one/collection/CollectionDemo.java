package org.example.one.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> nameList= new ArrayList<>();
        nameList.add("Adis");
        nameList.add("Alden");
        nameList.add("Zejd");
        nameList.add("Anja");
        nameList.add("Anja");
        nameList.add("Anja");
        nameList.add("Slađana");
        nameList.add("Dejla");

        for (int i = 0;  i< nameList.size(); i++) {
            String name= nameList.get(i);
            System.out.println(name);

        }

        Set<String> setofNames= new HashSet<>();
        setofNames.add("Adis");
        setofNames.add("Alden");
        setofNames.add("Zejd");
        setofNames.add("Anja");
        setofNames.add("Anja");
        setofNames.add("Anja");
        setofNames.add("Slađana");
        setofNames.add("Dejla");

        System.out.println("Setovi");
        for (String name : setofNames) {
            System.out.println(name);
    }
}}
