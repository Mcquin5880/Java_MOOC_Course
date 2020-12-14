import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        int[][] matrix = {{1,0,3}, {0,2,1}, {1,2,0}};
        System.out.println(matrixElementsSum(matrix));
    }

    private static int matrixElementsSum(int[][] matrix) {

        int totalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    // first check if top row
                    if (i == 0) {
                        totalSum += matrix[i][j];
                    } else {
                        // check if room above is haunted
                        // first make sure it's within matrix bounds
                        boolean hauntedRoomAbove = false;
                        for (int index = i; index >= 0; index--) {
                            if (matrix[index][j] == 0) {
                                hauntedRoomAbove = true;
                            }
                        }
                        if (!hauntedRoomAbove) {
                            totalSum += matrix[i][j];
                        }
                    }

                }
            }
        }
        return totalSum;
    }


}
