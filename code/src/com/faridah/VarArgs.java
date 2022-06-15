package com.faridah;

import java.util.Arrays;

public class VarArgs { // variable length arguments
    public static void main(String[] args) {
        fun(3, 5, 6, 7, 8, 9,23, 4234,55);
        multiple(3, 5, "Kunal","Faridah","friends");
    }
    static  void  fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    //static void multiple(int a,  String ...v,int b){} // Vararg parameter must be the last in the list
    static void multiple(int a, int b , String ...v){
        System.out.println("a: " + a + "b: "  + b + "List:" + Arrays.toString(v));
    }
}
