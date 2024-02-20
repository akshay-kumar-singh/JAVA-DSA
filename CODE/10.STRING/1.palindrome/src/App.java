import java.util.*;
public class App {

    public static boolean ispalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) throws Exception {
        String str = "racecar";
        System.out.println(ispalindrome(str));
    }
}
