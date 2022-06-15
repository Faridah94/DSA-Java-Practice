import java.sql.Array;
import java.util.Arrays;

public class searchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {23 , 4, 2},
                {18, 1, 2, 4, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        int target= 1;

        int[] ans = search(arr, target); // format of return value (row , col)

        System.out.println(Arrays.toString(ans));

        System.out.println(Arrays.toString(max(arr)));
    }

    static  int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if (arr[row][col] == target){
                    return new int[]{row , col}; // declare an object of the type array using "new" keyword && type --> new int[]
                }
            }
        }
        return new int[]{ -1 , -1 };
    }

    static  int[] max(int[][] arr){
        int max = Integer.MIN_VALUE; // look it up in

        for (int[] ints : arr) {
            for (int item : ints) {
                if (item > max){
                     max = item; // declare an object of the type array using "new" keyword && type --> new int[]
                }
            }
        }
        return new int[]{max};
    }
}
