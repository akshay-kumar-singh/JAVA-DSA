import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == 2){
            System.out.println("n is prime");
        } else{
            boolean isPrime = true;
            for(int i = 2; i<=Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println("n is prime");
            } else{
                System.out.println("n is not a prime");
            }
        }
    }
}