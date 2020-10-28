public class Variables {
    public static void main(String[] args) {
        //Variable assignment
        int num6; // variable num6 is an integer
        num6 = 2; // num6 is given the value of 2
        System.out.println(num6); // 2
        
        int num7 = 3; // integer variable num7 equals 3
        System.out.println(num7); // 3

        // Primitive Operations
        int num1 = 5;
        int num2 = 3;
        double num3 = 3.0;

        System.out.println(num1+num2); // 8
        System.out.println(num1-num2); // 2
        System.out.println(num1*num2); // 15
        System.out.println(num1/num2); // 1
        System.out.println(num1/num3); // 1.6666667
        System.out.println(num1%num2); // 2

        // Increment/Decrement Operators
        int num4 = 6;
        num4++;
        System.out.println(num4); // 7
        num4--;
        System.out.println(num4); // 6

        // Compound Operators
        int num5 = 9;
        num5+=1;
        System.out.println(num5); // 10
        num5/=2;
        System.out.println(num5); // 5
        num5*=5;
        System.out.println(num5); // 25
        num5-=10;
        System.out.println(num5); // 15

        // String Operations
        String str1 = "hello";
        String str2 = "goodbye";
        
        System.out.println(str1); // hello
        System.out.println(str2); // goodbye
        System.out.println(str1+str2); // hellogoodbye
        System.out.println(str1.charAt(2)); //l
        
        // Parsing
        String str3 = "7"; // string "7"
        int num8 = Integer.parseInt(str3);
        System.out.println(num8); // 7
        double num9 = Double.parseDouble(str3);
        System.out.println(num9); // 7.0
        System.out.println(str3); // 7

        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int
    
        System.out.println(myDouble);   // Outputs 9.78
        System.out.println(myInt);      // Outputs 9
    }
}
