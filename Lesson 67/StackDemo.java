import java.util.Stack; 
  
class StackDemo { 
    public static void main(String[] args) { 
        Stack stack1 = new Stack(); 
        // Stack<String> stack1 = new Stack<String>(); 
        stack1.push(4); 
        stack1.push("A"); 
        stack1.push("B"); 
        // Stack is read right to left
        System.out.println(stack1); // [4, A, B]
        System.out.println(stack1.pop()); // B
    } 
}
