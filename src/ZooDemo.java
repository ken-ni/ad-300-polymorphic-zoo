import java.util.ArrayList;
import java.util.Scanner;

public class ZooDemo {
    public static void main(String[] args) {
        Animal lion = new Lion("Leo");
        Animal elephant = new Elephant("Jumbo");
        Animal monkey = new Monkey("George");

        // Take user input to determine how many times the animals make sounds
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert a number to represent how many times you want the animals to make sounds");
        int animalSounds = scanner.nextInt();
        scanner.close();

        // Array List of all animals to activate their functions
        ArrayList<Animal> zoo = new ArrayList<Animal>();
            zoo.add(lion);
            zoo.add(elephant);
            zoo.add(monkey);

            // Print name, make their sound with normal makeSound. The overloaded superclass makeSound takes the integer user inputs to make the animals make that many sounds.
            for (Animal animal: zoo) {
                animal.getName();
                animal.makeSound();
                animal.makeSound(animalSounds);
            }
    }
}
