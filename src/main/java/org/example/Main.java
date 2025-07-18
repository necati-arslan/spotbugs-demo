package org.example;

public class Main {

    // 🔸 UUF_UNUSED_FIELD: Field is never referenced
    private String unusedField = "I am never used";

    public static void main(String[] args) {

        // 🔸 UC_USELESS_OBJECT: Object created but not used
        new String("Hello, I am not used");

        // 🔸 DLS_DEAD_LOCAL_STORE: Variable assigned but not used
        int temp = 42;

        Main obj = new Main();
        obj.demoMethod();
    }

    private void demoMethod() {
        // 🔸 URF_UNREAD_FIELD: Private field never read
        String unreadField = "Set but never read";
    }
}
