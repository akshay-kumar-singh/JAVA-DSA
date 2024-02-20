import java.util.*;

public class App {

    public static void insertionsortdescending(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // to find the index where curr is to be inserted

            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        insertionsortdescending(arr);
        printarr(arr);
    }
}
