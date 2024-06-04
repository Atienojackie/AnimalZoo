
public class Animal {
    protected String name;
    protected int age;


    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }

   
    public void eat() {
        System.out.println("Eating");
    }

    
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            makeSound();
        }
    }

    public void eat(String foodType) {
        System.out.println("Eating " + foodType);
    }
}

