public class App {

    public static int firstoccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstoccurance(arr, key, i+1);
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstoccurance(arr, 5, 0));
    }
}
