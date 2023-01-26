package org.example.two.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScanDemo2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("in.txt"))) {
            while (scanner.hasNext()) {
                String line = scanner.next();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}