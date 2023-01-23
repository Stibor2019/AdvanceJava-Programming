package org.example.two.io;

import java.io.*;
import java.util.Scanner;

public class ScanDemo {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader= new BufferedReader(new FileReader("in.txt"));
            Scanner scanner = new Scanner(reader)){
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        }catch (IOException e ){

         System.err.println(e.getMessage());

        }
       }
    }

