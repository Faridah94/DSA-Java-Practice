package com.faridah;

public class ReverseNums {
    public static void main(String[] args) {
        int n = 123456789;
        int reversNum =  0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;

            reversNum = reversNum * 10 + rem;
        }
        System.out.println(reversNum);
    }
    }

