public class AutoBoxing {

    public static void main(String[] args) {
        Integer i = 1; // Autoboxing
        int j = 0; // Unboxing

        System.out.println(i%2==0); // using int 
        System.out.println(i.intValue()==0); // using Integer
    }
}
