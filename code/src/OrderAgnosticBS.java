public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18 , -12, -4,  0, 2 , 3 , 4 , 15 , 16 , 18 , 22 , 45};
        int[] arr = {99 , 80 , 75 , 22 , 11 , 10 , 5 , 2, -3};
        int target = 22;
        int ans = OrderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int OrderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

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
