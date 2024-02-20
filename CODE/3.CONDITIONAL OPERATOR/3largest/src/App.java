import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        int A = 1, B = 3, C = 6;

        if( (A >= B) && (A >= C)){
            System.out.println(("largest is A"));
        }
        else if (B >= C){
            System.out.println("largest is B");
        }
        else{
            System.out.println("largest is C");
        }
    }
}
