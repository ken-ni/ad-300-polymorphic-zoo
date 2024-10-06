public class Lion extends Animal{
    
    Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}
