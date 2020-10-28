public class Arrays {
    public static void main(String[] args) {
        // <type> <identifier>[];
        int numList1[];
        numList1 = new int[20];
        //or
        // <type> <identifier>[] = <type>[<size>];
        int[] numList2 = new int[20];

        //Array literals
        int[] numList3 = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
        System.out.println(numList3[1]); // 2
        for (int i = 0; i < numList3.length; i++) 
            System.out.println("IDX " + i + " : "+ numList3[i]);        
        /*
        IDX 0 : 1
        IDX 1 : 2
        IDX 2 : 3
        IDX 3 : 4
        IDX 4 : 5
        IDX 5 : 6
        IDX 6 : 7
        IDX 7 : 8
        IDX 8 : 9
        IDX 9 : 10
        */
    }
}
