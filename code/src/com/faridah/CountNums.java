package com.faridah;

public class CountNums {
    public static void main(String[] args) {
        int n = 4555536;
        int count = 0;

        while(n > 0){
            int m = n % 10;
            if(m == 5){
                count ++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
