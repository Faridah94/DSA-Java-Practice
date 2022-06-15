public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6 ,7896};
//        System.out.println(findNumbers(nums));

//        System.out.println(digits(-35577));
        System.out.println(digits2(-4356546));

    }

    static  int findNumbers(int [] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)){ // call even() method
                count++;
            }
        }
        return count;

    }

    // check if number contain even number of digit
    // formulas:
    // 1- count the number of digits (n = n / 10)
    // 2- convert the number to string and take the length of it
     static boolean even(int num) {
        int numberOfDigits = digits(num); // call digits() method

//        if(numberOfDigits % 2 == 0){
//            return true;
//        }
//
//         return false;
         return numberOfDigits % 2 == 0;
     }

     // a math function return the solution in one line only
     static int digits2(int num){
         if ( num < 0 ){ // for negative numbers
             num = num * -1;
         }

        return (int)(Math.log10(num)) + 1; // no usage of for loop so it's more optimized
     }
    static int digits(int num) {
        if ( num < 0 ){ // for negative numbers
            num = num * -1;
        }
        if( num == 0){
            return 1;
        }

        int count = 0;

        while (num > 0){
            count++;
            num = num / 10; // or num /= 10;
        }
        return count;
    }

}
