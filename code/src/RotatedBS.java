public class RotatedBS {
    //https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

    // 1- find pivot
    // 2- do binary search

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means array is not rotated
        if (pivot == -1){
            // just do normal binary search
            return binarySearch(nums,target, 0, nums.length -1);
        }

        // if you find a pivot, it means you have two asc sorted arrays

        // how to find the ans using pivot
        // cases of search:
        // -1 target == pivot return pivot
        // 2- target > start then change the range of searching to be between [start , pivot -1]
        // 3- target < start then go search in the other half of the array that is less than the start which is [ pivot + 1 , end]


        if (nums[pivot] == target){
            return pivot;
        }
        if (target >= nums[0]){
            binarySearch(nums,target, 0, pivot-1);
        }
        return binarySearch(nums,target, pivot +1, nums.length -1);
    }
    static int binarySearch(int[] arr, int target, int start , int end){

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

    // this will not work for duplicate values in the array
    static  int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

         while (start <= end){
             int mid = start +( end - start) / 2;
             // 4 cases over here
             if (mid < end && arr[mid] > arr[mid + 1]){ // in case mid is the last element in the array so that means mid + 1 will exceed the range of the array and that will be error
                 return mid;
             }
             if (mid > start && arr[mid] < arr[mid - 1]){ // in case mid is the first element in the array so that means mid + 1 will exceed the range of the array and that will be error
                 return mid - 1 ;
             }
             if (arr[mid] <= arr[start] ){
                 //ignore all element from mid up because they are less than the list of the array
                 end = mid - 1;
             }else {
                 start = mid + 1;
             }

         }
         return -1;
    }

    // work for duplicate values in the array ex: [2,2,9,2,2,2]
    static  int findPivotWithDuplicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start +( end - start) / 2;

            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]){ // in case mid is the last element in the array so that means mid + 1 will exceed the range of the array and that will be error
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]){ // in case mid is the first element in the array so that means mid + 1 will exceed the range of the array and that will be error
                return mid - 1 ;
            }
            // if elements at middle , start , end are equal then just skip the duplicates
            if (arr[start] == arr[mid]  && arr[mid] == arr[end]){

                // skip the duplicates but first check them if they are pivot
                // NOTE: what if these elements at start and end were the pivot??
                // then we first have to check if start is a pivot

                if (arr[start] > arr[start +1]){
                    return start;
                }
                start++;

                // second we have to check if end is a pivot

                if (arr[end] < arr[end -1]){
                    return end;
                }
                end--;
            }

            // left side is sorted, so pivot should be on the right side and we have to search there
            else if(arr[start] < arr[mid]  || arr[start] == arr[mid] && arr[mid] > arr [end]){
                start  = mid +1;

            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
}
