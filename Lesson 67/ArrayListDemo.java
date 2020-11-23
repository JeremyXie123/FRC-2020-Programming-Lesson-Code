import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList colors = new ArrayList();
        ArrayList<String> colors = new ArrayList<String>(10);
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Orange");
        colors.remove("Green");
        System.out.println(colors); // [Red, Blue, Orange]
        System.out.println(colors.size()); // 3
        System.out.println(colors.contains("Orange")); // true
        System.out.println(colors.get(1)); // Blue
    }
}
