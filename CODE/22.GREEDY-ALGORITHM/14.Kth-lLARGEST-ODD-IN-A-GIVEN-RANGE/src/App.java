import java.util.*;

public class App {

    public static int kthOdd(int[] range, int K) {
        if (K <= 0) {
            return 0;

        }   
        int l = range[0];
        int r = range[1];
        

        if ((r & 1) > 0) {
            int Count = (int) Math.ceil((r - l + 1) / 2);
            if (K > Count) {
                return 0;
            } else {
                return (r - 2 * K + 2);
            }
        } else {
            int Count = (r - l + 1) / 2;
            if (K > Count) {
                return 0;
            } else {
                return (r - 2 * K + 1);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] p = { -10, 10 };
        int k = 8;
        System.out.println(kthOdd(p, k));
    }
}
