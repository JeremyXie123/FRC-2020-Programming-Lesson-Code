import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        //Primitive Operations
        int num1 = 5;
        int num2 = 3;
        double num3 = 3.0;

        System.out.println(num1+num2); //8
        System.out.println(num1-num2); //2
        System.out.println(num1*num2); //15
        System.out.println(num1/num2); //1
        System.out.println(num1/num3); //1.6666667
        System.out.println(num1%num2); //2

        //String Operations
        String str1 = "hello";
        String str2 = "goodbye";
        
        System.out.println(str1); //hello
        System.out.println(str2); //goodbye
        System.out.println(str1+str2); //hellogoodbye
        System.out.println(str1.charAt(2)); //l

        Scanner myInput = new Scanner(System.in); //11 22 
        System.out.println(myInput.next()); //11
        System.out.println(myInput.next()); //22
        myInput.close();
    }
}
