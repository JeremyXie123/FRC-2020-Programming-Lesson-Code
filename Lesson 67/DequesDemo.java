import java.util.Deque;
import java.util.LinkedList;

public class DequesDemo {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>(); 
        // add to first
        deque.push("Tail");
        // add to last
        deque.add("Head"); 
        // remove and retrieve from first
        System.out.println(deque.pop()); // Tail
        // remove and retrieve from last 
        System.out.println(deque.poll()); // Head
        System.out.println(deque); // []
    }
}
