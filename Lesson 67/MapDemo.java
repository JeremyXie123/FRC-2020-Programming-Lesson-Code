import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> hm  = new HashMap<String, Integer>();
    
        hm.put("a", 0);
        hm.put("b", 200);

        for (Map.Entry<String, Integer> me : hm.entrySet()) { 
            System.out.print(me.getKey() + ":"); 
            System.out.println(me.getValue()); 
        } 
        // a
        // b
    }
}
