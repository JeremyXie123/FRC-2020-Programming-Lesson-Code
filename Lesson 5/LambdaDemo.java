@FunctionalInterface
interface FuncInterface { 
    // An abstract method 
    void abstractFun(int x); 
} 
  
public class LambdaDemo { 
    public static void main(String args[]) { 
        //Functional interface
        FuncInterface fobj = (int x)->System.out.println(2*x); 
        // This calls above lambda expression 
        fobj.abstractFun(5);
        // 10 
        FuncInterface fobj2 = (int x)->System.out.println(4*x); 
        fobj2.abstractFun(5);
        // 20
        FuncInterface fobj3 = (int x)->{
            System.out.println(8*x); 
        };
        fobj3.abstractFun(5);
    } 
} 
