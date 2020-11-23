import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("C");
        System.out.println(set); // [A, B, C]
        System.out.println(set.size()); // 3
    }
}
