package org.example.three.two.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("in.txt");
            FileWriter writer= new FileWriter("out3.txt");
        ){
                   int charofContent;
                   while ((charofContent=reader.read())!=-1){
                       System.out.print((char)charofContent);
                       writer.write(charofContent);
                   }
        }catch (IOException e){
            System.err.println(e.getMessage());

        }
    }
}
