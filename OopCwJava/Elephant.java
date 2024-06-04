public class Elephant extends Animal {

    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Trumpet");
    }

    @Override
    public void eat() {
        System.out.println("Eating grass");
    }

    public static void main(String[] args) {
        Elephant elephant = new Elephant("", 10);
        elephant.makeSound();
        elephant.eat();
    }
}
