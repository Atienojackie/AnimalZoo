public class Zoo {
    public static void main(String[] args) {
        Animal lion = new Lion("", 5);
        Animal elephant = new Elephant("", 10);
        Animal monkey = new Monkey("", 3);

        System.out.println("");
        lion.makeSound();
        lion.eat();

        elephant.makeSound();
        elephant.eat();

        monkey.makeSound();
        monkey.eat();

        System.out.println("");
        lion.makeSound(3);
        lion.eat("meat");

        elephant.makeSound(2);
        elephant.eat("grass");

        monkey.makeSound(4);
        monkey.eat("bananas");
    }
    
}
