package org.example;

public class Main {

    public static void main(String[] args) {

        // 🔸 Magic number (42, 365 doğrudan yazılmış)
        int ageInDays = 42 * 365;

        // 🔸 Poor variable naming (anlamsız isim)
        int a = 5;

        // 🔸 Empty catch block (içi boş)
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // boş catch bloğu
        }

        // 🔸 MS_SHOULD_BE_FINAL: Final olabilecek ama olmayan sabit
        String greeting = "Hello";

        System.out.println(greeting);
    }
}
