package com.faridah;

public class Swap {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;


//        int temp = a;
//        a = b;
//        b = temp;
       int a = 12;
       int b = 20;

        swap(a,b);
        System.out.println(a + " "  + b);

        String name = "Kunal Kushwaha";
        System.out.println(name);
    }

    static void changeName(String naam){
        naam = "Rahul Rana"; //create new object in heap memory because string can't be changed for security reasons
    }
    static void swap(int a,int b){ // scope for a and b will be valid in this function of method only as they are accessed variables
        int temp = a;
         a = b; //create new object in heap memory because string can't be changed for security reasons
         b = temp; //create new object in heap memory because string can't be changed for security reasons
         System.out.println(a + " "  + b);
    }
}
