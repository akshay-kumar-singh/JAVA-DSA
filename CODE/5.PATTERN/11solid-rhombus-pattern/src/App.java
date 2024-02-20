public class App {

    public static void solid_rhombus(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=(n - 1); j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        solid_rhombus(5);
    }
}
