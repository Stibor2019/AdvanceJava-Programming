package org.example.three.homework;

import org.example.one.IntegerArray;

public class HomeworkDemo {


    public static void main(String[] args) {
        int[] numbers = new int[3];
        for (int number : numbers) {

        }
        //IntegerArray -> Iterable<Integer> ->
        IntegerArray numberArray = new IntegerArray();
        numberArray.add(23);
        numberArray.add(24);
        numberArray.add(29);
        numberArray.remove(24);
        numberArray.removeAt(0);
        numberArray.add(129);

        for (Integer number : numberArray)
            System.out.println(number);

    }
}


