interface AnimalEat {
   void eat();
}

interface AnimalTravel {
   void travel();
}

class Animal5 implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void travel() {
        System.out.println("Animal is travelling");
    }
}

public class InterfaceDemo {
   public static void main(String args[]) {
        Animal5 a = new Animal5();
        a.eat();
        a.travel();
        // Animal is eating
        // Animal is travelling
    }
}