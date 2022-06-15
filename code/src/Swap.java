import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 32, 14, 5, 66};

//        swap(arr, 1, 3);
        revers(arr);

        System.out.println(Arrays.toString(arr));
    }

     // reverse of array using two pointers start and end
    static void revers(int[] arr){
        int start = 0 ;
        int end = arr.length-1;

        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

     static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }

}
