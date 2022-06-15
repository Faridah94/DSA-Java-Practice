import java.util.Arrays;

public class ColNoFixed {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {55 ,6},
                {7 ,8 ,9}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
            System.out.println();
        }
//        for(int[] array: arr){
//            System.out.println(Arrays.toString(array)); // we used Arrays.toString(array) to print the array as string otherwise it won't work because we don't have nested for here with row and col values as counters
//
//        }
    }
}
