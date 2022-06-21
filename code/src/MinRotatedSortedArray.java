public class MinRotatedSortedArray {
    public static void main(String[] args) {

    }

    public int findMin(int[] nums) {
        int pivot = findPivot(nums);


//        if (nums[pivot] > nums[pivot + 1]){ // wrong answer
//            return nums[pivot + 1];
//        }else {
//            return  nums[0];
//        }
        if (pivot == -1){ // no pivot found and findPivot method returned -1 then it means it's fully rotated, and now it's equal to the original array
            return  nums[0];
        }else {
            return nums[pivot + 1];
        }

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
        return -1; // when no pivot is found
    }
}
