public class SmallestLetter {
    public static void main(String[] args) {

        char[] letters = {'c','f','j'};
        char target = 'd';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length -1;

        while (start <= end){
            // find the middle element
            // int mid = (start + end)/2; // might be possible that (start + end) exceed the range of integer in java
            // how find middle number in array

            int mid = start + (end - start) / 2 ;

            if ( target < letters[mid]){
                end = mid - 1 ; // search on the left side array

            } else {
                start = mid + 1; // search on the right side of the array
            }
        }
        return  letters [start % letters.length] ;
    }



}
