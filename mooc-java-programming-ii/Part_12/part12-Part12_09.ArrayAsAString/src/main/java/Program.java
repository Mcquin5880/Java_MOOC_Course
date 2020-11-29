
public class Program {

    public static void main(String[] args) {
        // Test your method here
        int rows = 2;
        int columns = 3;
        
        int[][] twoDimensionalArray = new int[rows][columns];
        twoDimensionalArray[0][1] = 4;
        twoDimensionalArray[1][1] = 1;
        twoDimensionalArray[1][0] = 8;
        
        int[][] matrix = {
            {1},
            {2,2},
            {3,3,3},
            {4,4,4,4}
        };
        System.out.println(arrayAsString(matrix));
        //System.out.println(arrayAsString(twoDimensionalArray));
    }
    
    public static String arrayAsString(int[][] array) {
        
        StringBuilder sb = new StringBuilder();
        
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
