import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(0, 1); // Adds 1 at 0 index 
        l1.add(1, 2); // Adds 2 at 1 index 
        l1.set(0, 3); // Sets 3 at 0 index
        System.out.println(l1); // [3,2]  
        List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(1,2,3)); 
        l1.addAll(l2);
        System.out.println(l1); // [3, 2, 1, 2, 3]
    }
}
