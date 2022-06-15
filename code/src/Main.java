public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        int a = 89;

        //Q: store a person's name
        String name = "Faridah Alabsi";

        // Q: store 5 roll numbers
        // syntax of arrays declare
        // dataType[] varaible_name = new dataType[size];
        int [] rnos =  new int[5];
        // or directly assigning values to the array
        int[] rons2 = {23, 12, 45, 32, 15};
        System.out.println(rnos[2]);  //  result 0

        String[] arr = new String[4];
        System.out.println(arr[3]); // result null - null is a literal and it's equivalent to None in python


    }
}
