package com.digit.Exceptions;

import java.io.Closeable;
import java.io.IOException;

class Resource implements Closeable {
    public void open() {
        System.out.println("Resource opened.");
    }

    public void use() {
        System.out.println("Resource used.");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Resource closed.");
    }
}


