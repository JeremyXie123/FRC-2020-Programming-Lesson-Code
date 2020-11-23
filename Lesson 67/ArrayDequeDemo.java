import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<Integer>(10); 
        // Using an arraydeque as a deque
        deque1.push(1);
        deque1.add(2);
        System.out.println(deque1); // [1,2]
        // Using an arraydeque as a stack
        ArrayDeque<Integer> stack1 = new ArrayDeque<Integer>(10); 
        // Using an arraydeque as a deque
        stack1.push(1);
        stack1.push(2);
        System.out.println(stack1.pop()); // 2
        System.out.println(stack1); // [1]
    }    
}
