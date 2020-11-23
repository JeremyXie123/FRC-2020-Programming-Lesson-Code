public class TestClass {
    int memberVar1; // Member variable

    public void doSomething() {
        // Method Body
        System.out.println("do Something");
    }

    TestClass() {
        System.out.println("Constructor was called");
    }

    public static void main(String[] args) {
        // Main method body
        TestClass Test = new TestClass();
    }
}
