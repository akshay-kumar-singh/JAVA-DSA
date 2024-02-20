public class App {

    public static int length(String str) {
        if(str.length() == 0) {
           return 0;
        }
        return length(str.substring(1)) + 1;
    }
    public static void main(String[] args) throws Exception {
        String str = "abcde";
        System.out.println(length(str));
    }
}
