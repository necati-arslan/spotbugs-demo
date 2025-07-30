package org.example;

// Inner static class can't access non-static fiels
// inner non-static class can access non-static fields becouse it have references

public class SubClass extends Outer {
    public void createAndUseInner() {
        // ✅ Create Inner using `this` (which is an Outer)
        Inner inner = this.new Inner();
        inner.printMessage();
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.createAndUseInner();
    }
}

