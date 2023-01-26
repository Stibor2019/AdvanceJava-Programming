package org.example.one;

public class ArrayDemo {
    public static void main(String[] args) {


        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 24;
        numbers[2] = 123;
//c++ for (int i = 0; i < numbers.length; i++) ;
//     int number;
//     {
//
//      int i = 0;
//      number = numbers[i];
//      System.out.println(number);
//     }

// enhaced for loop
        for (int number : numbers) {

            System.out.println(number);
        }
        //numbers[3]=120;//
        System.out.println("Dinamički niz:");
        IntegerArray integerArray = new IntegerArray();
        integerArray.add(23);
        integerArray.add(24);
        integerArray.add(123);
        integerArray.add(120);
        for (int number : integerArray) {
            System.out.println(number);
        }
        IntegerArray integerArray1 = new IntegerArray();
        integerArray1.add(1000);
        integerArray1.add(2000);
        for (int number : integerArray1) {
            System.out.println(number);
        }
    }
}