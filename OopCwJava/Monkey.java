
public class Monkey extends Animal {

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Chatter");
    }

    @Override
    public void eat() {
        System.out.println("Eating bananas");
    }

    public static void main(String[] args) {
        Monkey monkey = new Monkey("", 3);
        monkey.makeSound();
        monkey.eat();
    }
}