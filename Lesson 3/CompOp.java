public class CompOp {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;

        System.out.println(num1==num2); // false
        System.out.println(num1>num2); // true
        System.out.println(num1>=num2); // true
        System.out.println(num1!=num2); // true

        boolean state1 = true;
        boolean state2 = true;
        boolean state3 = false;

        System.out.println(state1 && state2); // true
        System.out.println(state2 && state3); // false
        System.out.println(state2 || state3); // true
        System.out.println(!state1); // false
    }
}
