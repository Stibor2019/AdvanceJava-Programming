package org.example.two.io;
//sadržaj fajla se može kopirati bajt po bajt
//java.io.fileinpustream klasa
//java-1,7 try catch finnally -: try with resource
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByteDemo {
    public static void main(String[] args) {
        //Reader nasReader= new Reader();
        try (FileInputStream  fin= new FileInputStream("in.txt");
             FileOutputStream fout = new FileOutputStream("out2.txt");
        ) {
            int jedanBajt;
            while ((jedanBajt = fin.read())!=-1){
                char slovo = (char) jedanBajt;
                System.out.print(slovo);
                fout.write(jedanBajt);
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);

         }
     }
}
