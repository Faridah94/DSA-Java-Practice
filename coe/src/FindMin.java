public class FindMin {
    public static void main(String[] args) {
        int[] nums = {23, 45, 2, 45, 6, 56,-11, -34, 3, 28, -2};
        System.out.println(min(nums));
    }

    // assume this is not an empty array
    // return the minimum value in the array

    static int min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

}
