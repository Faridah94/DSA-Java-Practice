package com.faridah;

public class Shadowing {
    //this will be available to everything inside the block of x which is shadowing class block
    static int x = 90; //this will be shadowed at line 8 because lower level scope always overshadowing high lever scope

    public static void main(String[] args) {
        System.out.println(x);
        int x = 30; // the class variable at line 5 is shadowed by this
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
}
