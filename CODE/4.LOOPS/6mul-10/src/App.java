import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter your number : ");
            int  n = sc.nextInt();

            if (n % 10 == 0){
                break;
            }
            System.out.println(n);
            
        }
        while(true);
    }
}
