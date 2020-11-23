public class OverrideDemo {
    public static void main(String[] args) {
        Cat3 a = new Cat3();
        a.makeSound();
        // true 
        // Meow
    }
}

class Animal3 {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Cat3 extends Animal3 {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}