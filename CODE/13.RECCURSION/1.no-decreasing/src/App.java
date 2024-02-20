public class App {

    public static void printdec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.print(n+" ");
        printdec(n-1);
    }
    public static void main(String[] args) throws Exception {
        int n = 10;
        printdec(n);
    }
}
