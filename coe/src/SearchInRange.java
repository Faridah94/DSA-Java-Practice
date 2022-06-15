public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 45, 2, 45, 6, 56,-11, -34, 3, 28, -2};
        int target = 3;
        System.out.println(linearSearch(nums,target,1, 4));

    }

    static int linearSearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        // run a for loop
        for (int index = start; index < end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return  -1;
    }
}
