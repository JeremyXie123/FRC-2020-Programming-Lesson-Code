public class PolyMorphismDemo {
    public static void main(String[] args) {
        Animal2 a = new Dog2();
        Animal2 b = new Cat2();
        a.makeSound();
        b.makeSound();
        System.out.println(a instanceof Animal2);
        System.out.println(b instanceof Dog2);
        // Woof
        // Meow
        // true
        // false
    }
}

class Animal2 {
    public void makeSound() {
      System.out.println("Grr...");
    }
}

class Cat2 extends Animal2 {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog2 extends Animal2 {
    public void makeSound() {
        System.out.println("Woof");
    }
}