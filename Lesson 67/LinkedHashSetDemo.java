import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("B");
        set.add("A");
        set.add("C");
        set.add("D");
        set.remove("A");
        System.out.println(set); // [B, C, D]
        System.out.println(set.size()); // 3
    }    
}
