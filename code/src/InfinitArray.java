public class InfinitArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140,160,170};

        int start = arr[0];
        int end = arr[1];


        int target = 10;
        int ans = binarySearch(arr,target,start,end);
        System.out.println(ans);
    }

    static int findingAnswer(int[] arr, int target){
        // first find the range
        // first start with a box of size 2

        int start = 0;
        int end = 1;

        // while target is greater than end which means it's greater than start too because start is less than end
        // then keep doubling the range of the box size that we are searching inside it
        // condition for the target to lie in range

        if (target > arr[end]){
            int neweStart = end + 1;

            // double the size of the box using this formula
            // newEnd = previous end + size_of_the_previous_box * 2

            int newEnd = end + ( end - start + 1) * 2; // didn't understand it!! review it with kunal tutrial no 15
        }
        return binarySearch(arr,target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){

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
        return -1;
    }
}
