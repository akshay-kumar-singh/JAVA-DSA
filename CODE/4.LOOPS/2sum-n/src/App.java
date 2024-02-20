import java.util.*;;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;

        while(i<=n){
            sum += i;
            i++;
        }

        System.out.println("sum is : " + sum);
    }
}
