public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = searchRange(arr,target);
        System.out.println(ans);
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // this function is for checking for the first occurrence of the target

//        int start = search(nums,target,true);
//        int end = search(nums,target,false);
//        ans[0] = start;
//        ans[1] = end;

        ans[0]  = search(nums,target,true);

        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;

        int start = 0;
        int end = nums.length -1;

        while (start <= end){
            // -1  here we are checking for the first occurrence of the target

            // int mid = (start + end)/2; // might be possible that (start + end) exceed the range of integer in java
            int mid = start + (end - start) / 2 ;

            if ( target < nums[mid]){
                end = mid - 1 ; // search on the left side array

            } else if ( target > nums[mid]){
                start = mid + 1; // search on the right side of the array
            } else {
                // if we found one possible answer i.e nums[mid] == target
                // potential answer found
                ans = mid;

                if(findStartIndex){ // if you are trying to fine start index go mid - 1
                    end = mid -1;
                }else { // go find end index go mid + 1
                    start = mid +1;
                }

            }
        }
        return ans;
    }
}
