package org.example;

public class Person {
    private String name;
    private Address address; // Inner class instance

    public Person(String name, String street, String city) {
        this.name = name;
        this.address = new Address(street, city);
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Lives at: " + address.street + ", " + address.city);
    }

    // Inner class to represent address details
    public static class Address {
        private String street;
        private String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", "123 Main St", "New York");
        person.printInfo();
    }
}
