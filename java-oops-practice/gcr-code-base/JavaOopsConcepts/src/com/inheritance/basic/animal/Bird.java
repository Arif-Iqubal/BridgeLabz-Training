package com.inheritance.basic.animal;

//Bird is a type of Animal
public class Bird extends Animal {

 public Bird(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println(name + " says: Chirp Chirp");
 }
}

