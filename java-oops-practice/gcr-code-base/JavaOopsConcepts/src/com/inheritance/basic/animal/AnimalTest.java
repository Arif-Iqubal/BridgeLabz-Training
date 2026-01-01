package com.inheritance.basic.animal;

public class AnimalTest {
    public static void main(String[] args) {

        // Polymorphism: Animal reference
        Animal a1 = new Dog("Buddy", 3);
        Animal a2 = new Cat("Kitty", 2);
        Animal a3 = new Bird("Tweety", 1);

        a1.makeSound();
        a2.makeSound();
        a3.makeSound();
    }
}

