import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        // Using casting
        List list1 = new ArrayList();
        list1.add("hello");
        String s1 = (String) list1.get(0);
        System.out.println(s1);

        // Using Generics
        List<String> list2 = new ArrayList<String>();
        list2.add("hello");
        String s2 = list2.get(0);  
        System.out.println(s2);

        /* what generics do in this sense is that they 
        set the array object to interact with its methods using that type.
        It does not actually make a list of strings, but a list of objects 
        that is set to utilize its methods with arguments as if they were strings
        */
    
    }
}
