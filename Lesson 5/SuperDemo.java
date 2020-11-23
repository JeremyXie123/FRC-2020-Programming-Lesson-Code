class Base {
    public void doThing() {
        System.out.println("Doing thing");
    }
}

class Derived extends Base {
    // Do something in addition to 
    // what the base class does!
    @Override 
    public void doThing() {
        // Use super to access the overriden base implementation
        // base implementation
        super.doThing();
        // Now do the additional thing
        System.out.println("Doing another thing");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Base b = new Base();
        b.doThing();
        Derived d = new Derived();
        d.doThing();
    }
}

