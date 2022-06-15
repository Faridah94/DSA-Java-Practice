import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // initialization // important or "list" will have null value So we are locating -giving place inside memory- 3 arrays inside it as value for the big list
        for (int i = 0; i < 3 ; i++) {
            list.add(new ArrayList<>());
        }

        // add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
