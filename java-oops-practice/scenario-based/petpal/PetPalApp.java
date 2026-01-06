package petpal;

//Main class to test PetPal application
public class PetPalApp {

 public static void main(String[] args) {

     // Create pets
     Pet dog = new Dog("Buddy", 3);
     Pet cat = new Cat("Luna", 2);
     Pet bird = new Bird("Kiwi", 1);

     // Interact with dog
     dog.makeSound();
     dog.feed();
     dog.play();
     dog.showStatus();

     System.out.println();

     // Interact with cat
     cat.makeSound();
     cat.play();
     cat.sleep();
     cat.showStatus();

     System.out.println();

     // Interact with bird
     bird.makeSound();
     bird.feed();
     bird.sleep();
     bird.showStatus();
 }
}

