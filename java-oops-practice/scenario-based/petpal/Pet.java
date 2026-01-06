package petpal;

import java.util.Random;

//Base Pet class
abstract class Pet implements IInteractable {

 protected String name;
 protected String type;
 protected int age;

 // Internal states must be encapsulated
 private int hunger;  // 0 (full) to 100 (very hungry)
 private int energy;  // 0 (tired) to 100 (energetic)
 private String mood; // Happy, Neutral, Sad

 // Random generator for default values
 private static final Random rand = new Random();

 // Constructor with random default values
 public Pet(String name, String type, int age) {
     this.name = name;
     this.type = type;
     this.age = age;
     this.hunger = rand.nextInt(50);     // random hunger
     this.energy = 50 + rand.nextInt(50); // random energy
     updateMood();
 }

 // Constructor with user-specified values
 public Pet(String name, String type, int age, int hunger, int energy) {
     this.name = name;
     this.type = type;
     this.age = age;
     this.hunger = hunger;
     this.energy = energy;
     updateMood();
 }

 // Feed the pet (reduce hunger, increase energy)
 @Override
 public void feed() {
     hunger -= 20;   // operator usage
     energy += 10;
     normalizeLevels();
     updateMood();
     System.out.println(name + " has been fed.");
 }

 // Play with the pet (increase hunger, reduce energy)
 @Override
 public void play() {
     hunger += 15;   // operator usage
     energy -= 20;
     normalizeLevels();
     updateMood();
     System.out.println(name + " enjoyed playing!");
 }

 // Pet sleeps (restore energy, slight hunger increase)
 @Override
 public void sleep() {
     energy += 30;   // operator usage
     hunger += 10;
     normalizeLevels();
     updateMood();
     System.out.println(name + " is sleeping peacefully.");
 }

 // Ensure values stay within limits
 private void normalizeLevels() {
     hunger = Math.max(0, Math.min(hunger, 100));
     energy = Math.max(0, Math.min(energy, 100));
 }

 // Mood logic based on internal state
 private void updateMood() {
     if (energy > 60 && hunger < 40) {
         mood = "Happy";
     } else if (energy < 30 || hunger > 70) {
         mood = "Sad";
     } else {
         mood = "Neutral";
     }
 }

 // Public method to view pet status (no direct modification)
 public void showStatus() {
     System.out.println("Pet Name: " + name);
     System.out.println("Type: " + type);
     System.out.println("Age: " + age);
     System.out.println("Hunger Level: " + hunger);
     System.out.println("Energy Level: " + energy);
     System.out.println("Mood: " + mood);
 }

 // Polymorphic method
 public abstract void makeSound();
}

