public class App {

    public static int calcsum(int n){
        if(n == 1){
            return 1;
        }
        int snm1 = calcsum(n-1);
        int sn = n + snm1;
        return sn;
    }
    public static void main(String[] args) throws Exception {
        int n = 5;
        System.out.println(calcsum(n));
    }
}
