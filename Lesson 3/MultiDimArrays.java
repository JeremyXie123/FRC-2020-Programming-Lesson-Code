public class MultiDimArrays {
    public static void main(String[] args) {
        int[][] test1 = new int[3][4];
        //Multi Dimensional Array Reading
        int[][] data = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
        for (int i = 0; i < data.length; ++i) {
            for(int j = 0; j < data[i].length; ++j) {
                System.out.print(data[i][j]+" ");
            }
            // 1 2 3 4 5 6 9 7
        }
    }
}
