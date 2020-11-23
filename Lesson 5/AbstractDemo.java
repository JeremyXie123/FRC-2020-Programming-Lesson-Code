public class AbstractDemo {
    public static void main(String[] args) {
        Dog4 dog = new Dog4();
        dog.makeSound();
        // Woof
    }
}

abstract class Animal4 {
    public abstract void makeSound();
}

class Dog4 extends Animal4 {
    public void makeSound() {
        System.out.println("Woof");
    }
}