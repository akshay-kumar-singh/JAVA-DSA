public class App {
    public static void main(String[] args) throws Exception {
        int x = 3, y = 4;
        System.out.println("Before swap: x = " + x + " and y = " + y);
        // swap using xor
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " and y = " + y);
    }
}
