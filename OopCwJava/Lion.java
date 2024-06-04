public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat");
    }

    public static void main(String[] args) {
        Lion lion = new Lion("", 5);
        lion.makeSound();
        lion.eat();
    }
}
