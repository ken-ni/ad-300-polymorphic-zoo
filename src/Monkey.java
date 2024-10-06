public class Monkey extends Animal{
    
    Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Ooo ooo aah aah");
    }
}
