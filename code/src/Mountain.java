public class Mountain {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

         while (start < end){
             int mid = start + (end - start) / 2 ;
             if (arr[mid] > arr[mid + 1]){
                 // you're in the decreasing part of array
                 // this maybe the answer but look at the left part
                 // this is why end != mid - 1

                 end = mid;

             }else {
                 // you're in ascending part of array so keep searching
                 // cause we know that (mid + 1)-element > mid-element
                 start = mid +1;
             }
         }
         // in the end start == end and pointing to the largest number because of 2 checks above
        // start and end are always trying to find max element in the above 2 checks

        return start; // or end as they are pointing to the max number at the end of these checks
    }
}
