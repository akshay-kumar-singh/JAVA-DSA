import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter an integer: ");
        num = sc.nextInt();
        if(isEven(num)) {
        System.out.println("Number is even");
        } else {
        System.out.println("Number is odd");
        
        }
        }
        public static boolean isEven(int number) {
        if(number % 2 == 0) {
        return true;
        }
        else {
        return false;
        }   
    }
}
