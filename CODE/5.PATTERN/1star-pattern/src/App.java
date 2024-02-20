public class App {
    public static void main(String[] args) throws Exception {
        for(int line=1; line<=4; line++){
            for(int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
