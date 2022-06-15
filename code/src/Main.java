import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
//        String fruit = in.next();
        /*
        switch(expression){
          // cases

          case one:
             // do something
             break;
          case two:
             // do something
             break;
          default:
             // do something
        }
        * */

//        switch (fruit){
//            case "Mango":
//                System.out.println("king of fruit");
//                break;
//            case "Apple":
//                System.out.println("A sweet re fruit");
//                break;
//            case "orange":
//                System.out.println("Round yellow fruit");
//                break;
//            case "GrapeFruit":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("please enter a valid fruit");
//        }

        int day = in.nextInt();
        switch (day){
//            case 1-> System.out.println("Saturday");
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("please enter a valid day");
        }

    }
}
