package com.faridah;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

    private static boolean isPrime(int num) {
        if(num <= 1){
            System.out.println("not prime");
            return false;
        }
        int c = 2;
//        while (c * c <= num)
//        { // or you can use this formula c * c <= num which is equivalent to c <= Math.sqrt(num) which reduce the repetition of numbers
//            if (num % c == 0){
//                System.out.println("not prime");
//                return false;
//            }
//            c++;
//        }
//        return c * c <= num;
//    }
        while (c <= Math.sqrt(num)) { // or you can use this formula c * c <= num which is equivalent to c <= Math.sqrt(num) which reduce the repetition of numbers
            if (num % c == 0){
                System.out.println("not prime");
                return false;
            }
            c++;
        }
        return c > Math.sqrt(num);
    }
}
