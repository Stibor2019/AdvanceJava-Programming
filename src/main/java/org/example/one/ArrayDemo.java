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
          DynamicArray dynamicArray = new DynamicArray();
          dynamicArray.add(23);
          dynamicArray.add(24);
          dynamicArray.add(123);
          dynamicArray.add(120);
          for (int number : dynamicArray) {
          System.out.println(number);
  }
 }
}