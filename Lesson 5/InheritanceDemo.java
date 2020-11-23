public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println("Legs: "+dog.legs);
        dog.eat();
        /* I am an animal.
        I am a Dog!
        Legs: 4
        I can eat. */
    }
}

class Animal {
    protected int legs;
    Animal() {
        System.out.println("I am an animal.");
    }

    public void eat() {
        System.out.println("I can eat.");
    }
}
  
class Dog extends Animal {
    Dog() {
        System.out.println("I am a Dog!");
        legs = 4;
    }
}