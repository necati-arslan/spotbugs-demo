package org.example;

public class Outer {
    private String message = "Hello from Outer";

    public class Inner {
        public void printMessage() {
            System.out.println(message);
        }
    }
}
