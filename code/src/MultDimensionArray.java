import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultDimensionArray {
    public static void main(String[] args) {
        /*
           1 2 3
           4 5 6
           7 8 9
        * */

        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][]; // we must add the number of rows but it's ok if we didn't add number of column
        // or using the hard code

//        int [][] arr2D = { // an array of arrays
//                { 1 , 2 , 3 }, // 0th index
//                { 4 , 5 }, // 1st index
//                { 6, 7 , 8 , 9 } // 2n index  // arr2D[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3]; // arr.length = row's numbers
        System.out.println(arr.length);
//
        // input into array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        // output array
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.println(arr[row][col]);
//            }
//            System.out.println();
//        }

//        // output array
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int[] array: arr){
            System.out.println(Arrays.toString(array)); // we used Arrays.toString(array) to print the array as string otherwise it won't work because we don't have nested for here with row and col values as counters

        }
    }
}
