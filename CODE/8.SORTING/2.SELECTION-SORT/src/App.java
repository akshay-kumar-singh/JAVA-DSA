import java.util.*;

public class App {

    public static void selectionsortdecending(int arr[]){
        for(int turn=0; turn<arr.length; turn++){
            int minpos = turn;
            
            for(int j=turn+1; j<arr.length; j++){
                if(arr[minpos] < arr[j]){
                    minpos=j;
                }
            }

            //swap
            int temp = arr[turn];
            arr[turn] = arr[minpos];
            arr[minpos] = temp;
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
        selectionsortdecending(arr);
        printarr(arr);
    }
}
