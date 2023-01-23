package org.example.one.exception;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Unesite neki broj...");
        int [] numbers = new int[3];
        int number = new Scanner(System.in).nextInt();
        //UNCHECKED EXCEPTION
        System.out.println(number/0);
        numbers[33]=number;
        System.out.println("Uneseni broj je:"+number);

        //CHECKED EXCEPTION,KOMPAJLER NEĆE IZVRŠITI BEZ TRY/CATCH
        try{
        readFile("sadržaj.txt");
            } catch(FileNotFoundException exception) {
            System.err.print(exception.getMessage());
        }
    }
   static void readFile(String imeFajla) throws FileNotFoundException {

   }
}
