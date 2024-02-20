import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while(counter <= range){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
    }
}
