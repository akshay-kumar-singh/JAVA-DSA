import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("enter your no ; ");
            int n = sc.nextInt();

            if (n % 10 == 0){
                continue;
            }
            System.out.println("number was : " + n);
        }
        while(true);
    }
}
