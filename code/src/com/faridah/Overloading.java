package com.faridah;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//        fun(34);
//        fun("faridah");

//        demo(5,7,3,3,2);
        demo("dada","faridah","fererro");
       // demo(); // Ambiguous method call. Both
    }

    static  void  demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static  void  demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a){
        System.out.println(a);
    }

    //static void fun(int a){ // error because they are having the same name

    static void fun(String name){
        System.out.println(name);
    }
}
