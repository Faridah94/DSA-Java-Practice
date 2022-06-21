public class SearchInMountain {
    public static void main(String[] args) {
        // https://leetcode.com/problems/find-in-mountain-array/
    }

    // 1- find peak and the right half of the array that you will search in for target
    // 2- do binary search

    static int findInMountainArray(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1){
            return  firstTry;
        }
        // try to search in second half using binary search
        return OrderAgnosticBS(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end){

            int mid = start + (end - start) / 2 ;

            if (arr[mid] > arr[mid + 1]){
                // you're in the decreasing part of array
                // this maybe the answer but look at the left part
                // this is why end != mid - 1

                start = mid;

            }else {
                // you're in ascending part of array so keep searching
                // cause we know that (mid + 1)-element > mid-element
                end = mid - 1;
            }
        }
        // in the end start == end and pointing to the largest number because of 2 checks above
        // start and end are always trying to find max element in the above 2 checks

        return start; // or end as they are pointing to the max number at the end of these checks
    }

    static int OrderAgnosticBS(int[] arr, int target , int start, int end){

        boolean isAsc = arr[start] <  arr[end]; // start is less than end = ascending order else is descending order

        while (start <= end){
            // find whether the array is sorted in ascending or  descending
            int mid = start +( end - start) / 2;

            if (arr[mid] == target){
                return  mid;
            }

            if(isAsc){
                if ( target < arr[mid]){
                    end = mid - 1 ; // search on the left side array

                } else{
                    start = mid + 1; // search on the right side of the array
                }
            }

            else {
                if (target > arr[mid]) {
                    end = mid - 1; // search on the left side array

                } else {
                    start = mid + 1; // search on the right side of the array
                }
            }
        }
        return -1;
    }
}
