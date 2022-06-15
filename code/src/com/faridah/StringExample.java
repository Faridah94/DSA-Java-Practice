package com.faridah;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String Myname = greet();
//        System.out.println(Myname);
        Scanner in =new Scanner(System.in);
        System.out.println("Enter your name: ");
        String  name = in.next();


        String personalized = myGreeting(name);
        System.out.println(personalized);
    }

     static String myGreeting(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet(){
//        Scanner in = new Scanner(System.in);
//        String name = in.next();
        String name = "my name is faridah";

        return name;
    }
}
