public class Elephant extends Animal{
    
    Elephant(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Squeak");
    }
}
