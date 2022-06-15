package com.faridah;

public class Scope {
    public static void main(String[] args) {

        //anything that has initialized outside the block can be used (updated) inside the block but
        //anything that has initialized inside the block can't be use outside the block
        //And
        //anything that has initialized inside the block can be initialized outside the block but not used or updated outside the block

        int a = 10;
        int b = 20;
        String name = "kunal";
        {
            // int a = 89; //error cuz a is already initialized you can't declare it again
            a = 89; // reassign (update) the original ref variable to some other value
            int c = 99;
            name = "faridah";
        }
        //System.out.println(c);
        System.out.println(name);

        // because of block scope- any values inside that block will only be seen (remain) inside that block
        // but if those value already initialized outside that block they can't be reinitialized again but they can be changed

        //scope In for loops
        for(int i = 0; i < 4; i++){
            System.out.println(i);
            int num = 90;
            // int a = 10; //can't be initialized because it's already initialized outside for loop
            a= 20;
        }
    }
    static void random(){
        int a = 21;
        System.out.println(a); // scope for a not allowed in this function or method
    }
}
