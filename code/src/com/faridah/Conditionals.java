package com.faridah;

public class Conditionals {
    public static void main(String[] args) {
        /*
           syntax of if statements:
           if (boolean expression T of F){
               // body
           }else{
               // body
           }
        */

        int salary = 24500;
        if (salary > 10000){
            salary += 2000; // salary = salary + 2000;
        }else if (salary > 20000){
            salary += 3000;
        }else{
            salary += 1000;
        }

        System.out.println(salary);
    }
}
