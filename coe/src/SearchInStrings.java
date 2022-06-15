import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "faridah";
        char target = 'u';

//        boolean ans = search(name, target);
//        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray())); // Arrays.toString used when print arrays

    }
    static boolean search(String str, char target){
        if (str.length() == 0){ // str.length() is a function that give the length of string internally is arr.length
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target){
        if (str.length() == 0){ // str.length() is a function that give the length of string internally is arr.length
            return false;
        }
          for (char ch: str.toCharArray()){
              if (ch == target){
                  return  true;
              }
          }
          return false;
        }

    }

