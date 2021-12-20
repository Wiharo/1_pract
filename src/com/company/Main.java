package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Собака", "Крутой Максим");
        System.out.print("Имя собаки: " + dog1.getName() + "\nИмя владельца: " + dog1.getDogOwner());
    }
}
