public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method has no body in superclass, body to be implemented in derived classes
    public abstract void makeSound();

    // Return animal name
    public void getName() {
        System.out.println(name);
    }

    // Overloaded makeSound method that takes integers when they are provided in makeSound method.
    public void makeSound(int number) {
        System.out.println("Overloaded Version:");
        for (int i = 0; i < number; i++) {
            makeSound();
        }
        System.out.println("");
    }
}
