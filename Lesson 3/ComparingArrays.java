import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] args) {
        // Equivalent Content vs Equivalent Reference
        int arr1[] = {1, 2, 3}; 
        int arr2[] = {1, 2, 3}; 
        if (arr1 == arr2) {
            System.out.println("Same Object");
        }
        else{
            System.out.println("Different Objects");
        }
        if (Arrays.equals(arr1,arr2)){
            System.out.println("Same Contents");
        }
        else{
            System.out.println("Different Contents");
        }
    }
}
