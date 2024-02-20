import java.util.*;

public class App {

    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }

        System.out.println("smallest value is : " + smallest);

        return largest;
    }

    public static void main(String[] args) throws Exception {
        int numbers[] = { 1,2,3,4,5,6,7};
        System.out.println("largest value is : " + getlargest(numbers));
    }
}