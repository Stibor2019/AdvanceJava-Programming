package org.example.three.two.io;

import java.io.Closeable;

public class Reader implements Closeable {
    @Override
    public void close() {
        System.out.println("Neko je pozvao funkciju close...");
    }
}
