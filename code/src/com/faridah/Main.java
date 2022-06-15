package com.faridah;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//       int ans = sum2();
//        System.out.println(ans);

        int ans = sum3(12,44);
        System.out.println(ans);



//
//        System.out.println("Enter number 1:");
//         num1 = in.nextInt();
//
//        System.out.println("Enter number 2:");
//         num2 = in.nextInt();
//
//         sum = num1 + num2;
//
//        System.out.println("The sum =" + sum);

    }

    // pass the value of numbers when you are calling the method in main

    static int sum3(int a , int b){
        Scanner in = new Scanner(System.in);


        int sum3 = a + b;
        return sum3;
    }

    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter number 1:");
        num1 = in.nextInt();

        System.out.println("Enter number 2:");
        num2 = in.nextInt();

        int sum = num1 + num2;

        return sum;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.println("Enter number 1:");
        num1 = in.nextInt();

        System.out.println("Enter number 2:");
        num2 = in.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum =" + sum);
    }
}

