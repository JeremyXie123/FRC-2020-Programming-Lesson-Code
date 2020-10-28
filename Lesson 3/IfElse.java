public class IfElse {
    public static void main(String[] args) {
        int num1 = 5;
        // Condition if var_x is greater than 5
        if(num1>5){
            // if num1 is greater than 5
            System.out.println(num1+" is greater than 5");
        }
        else if(num1==5){
            // if num1 is equal to 5
            System.out.println(num1+" is equal to 5");
        }
        else{
            // if neither of the above applies
            // "if num1 is less than 5"
            System.out.println(num1+" is less than 5");
        }
        System.out.println("Exited Statement");
    }
}
