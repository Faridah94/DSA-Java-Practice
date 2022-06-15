import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 33;
        arr[2] = 344;
        arr[3] = 43;
        arr[4] = 113;

//        System.out.println(arr[3]);

        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr)); // change to string

//        for (int element : arr) { // for every element in array, print the element
//            System.out.println(element); // here element represents element of the array
//        }

        // array of objects (non primitives)
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        str[1] = "kunal";
        System.out.println(Arrays.toString(str));
    }
}
