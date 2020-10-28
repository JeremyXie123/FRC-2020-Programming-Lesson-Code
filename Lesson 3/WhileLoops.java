public class WhileLoops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.print(i);
            i++;
            // 01234
        }         

        int j = 0;
        do{
            System.out.print(j);
            j++;       
            // 01234         
        }
        while(j < 5);
    }
}
