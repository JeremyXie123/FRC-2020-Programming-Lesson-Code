import java.util.LinkedList; 
import java.util.Queue; 

class QueueDemo { 
    public static void main(String[] args) { 
        Queue<Integer> q = new LinkedList<>();  
        for (int i = 0; i < 5; i++){
            q.add(i);
        }
        System.out.println(q); 
        q.remove(); 
        System.out.println(q); 
        System.out.println(q.peek()); 
        System.out.println(q.size()); 
    } 
}
