public class ThrowsDemo {
    static int div(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int val = div(a,b);
        System.out.println(val);
    }
}
