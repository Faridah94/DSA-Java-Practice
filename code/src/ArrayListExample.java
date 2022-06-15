import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        Scanner in = new Scanner(System.in);

        // adding to arraylist using listname.add()
//        list.add(45);
//        list.add(41);
//        list.add(15);
//        list.add(435);
//        list.add(13);
//        list.add(23);
//        list.add(113);
//        list.add(47);

        /*System.out.println((list.contains(44)));
        list.set(4, 88);
        list.remove(3);
        System.out.println(list);
*/
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt()); // adding to arraylist
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)); // read from arraylist
        }

        System.out.println(list);
    }
}
