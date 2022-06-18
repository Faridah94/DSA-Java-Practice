public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14 ,18};
        int target = 15;
        int ans = ceiling(arr,target);
        System.out.println(ans);
    }

    // return the index : smallest  number >= target
    static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        // but what if the target element is greater than the greatest number in the array

        if (target > arr.length - 1){
            return  -1;
        }

        while (start <= end){
            // find the middle element
            // int mid = (start + end)/2; // might be possible that (start + end) exceed the range of integer in java
            // how find middle number in array

            int mid = start + (end - start) / 2 ;
            if ( target < arr[mid]){
                end = mid - 1 ; // search on the left side array

            } else if ( target > arr[mid]){
                start = mid + 1; // search on the right side of the array
            } else {
                // ans found
                return mid;
            }
        }
        return start;
    }
}
