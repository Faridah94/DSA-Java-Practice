public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
        // person == row
        // account == col
        int max = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            // when start new col, take the sum of that row which represent person's account
            for (int anInt : ints) {
                sum += anInt;
            }

            // now we have sum of accounts of person
            // check with overaltavbl max
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
