package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final List<String> roles = new ArrayList<>();

    public User() {
        roles.add("USER");
    }

    public List<String> getRoles() {
        // ❌ SpotBugs burada EI_EXPOSE_REP uyarısı verir
        return roles;
        //return new ArrayList<>(roles);
    }

    public static void main(String[] args) {
        User user = new User();

        // getRoles ile içteki listeye doğrudan erişim ve değişiklik
        List<String> exposed = user.getRoles();
        exposed.add("ADMIN");  // User nesnesinin iç durumu dışarıdan değiştirildi!

        System.out.println("User roles: " + user.getRoles()); // USER, ADMIN

        User user2 = new User();

        // getRoles ile içteki listeye doğrudan erişim ve değişiklik
        System.out.println("User roles: " + user2.getRoles()); // USER, ADMIN

    }
}
