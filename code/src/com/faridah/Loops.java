package com.faridah;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Q: print numbers from 1 to 5
        /*
           syntax of if statements:

           for (initialization; condition; increment/decrement){
               // body
           }
        */

//        for(int num = 1; num <=5 ; num++){
//            System.out.println(num);
//        }

        //print number form 1 to n
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 0; num <= n; num++) {
////            System.out.println(num + " ");
//            System.out.println("Hello World");
//        }
//
        //while loops
        /*
        while(condition){
          body
        }
        */

//        int num = 1;
//        while (num <= 5){
//            System.out.println(num);
//            num +=  1;
//        }

        // do-while loops // it will execute at least one time after that it will check the condition, it's doing the
        //opposite of (for and while)
        /*
        do{
           dody
        }
        while(condition);
        */

//          int num = 1;
//          do {
//              System.out.println(num);
//          }
//        while (num != 1);

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest of the 3 numbers
//        int max = a;
//        if(b > max){
//            max = b;
//        }if(c > max){
//            max = c;
//        }
        int max  =Math.max (c, Math.max(a,b));
        System.out.println(max);
    }
}
