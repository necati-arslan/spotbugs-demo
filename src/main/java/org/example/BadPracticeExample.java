package org.example;

public class BadPracticeExample {

    public static void main(String[] args) {

        // 🔸 Thread.run()
        Thread t = new Thread(() -> System.out.println("Running thread"));
        t.run(); // ❌ SpotBugs: "Did you mean start()?"

        //
        "hello".trim(); // ❌

       // String trimmed = "hello".trim();
        //System.out.println(trimmed); // ✅

            }
}


