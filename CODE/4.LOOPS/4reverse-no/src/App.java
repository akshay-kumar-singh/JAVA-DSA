import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int n = 234567;

        while ( n > 0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n / 10;
        }

        System.out.println();
    }
}
