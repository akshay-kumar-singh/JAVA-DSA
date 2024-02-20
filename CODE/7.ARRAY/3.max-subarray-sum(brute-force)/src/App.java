public class App {

    public static void maxsubarraysum(int numbers[]) {

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = 1;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currsum = 0;

                for (int k = start; k <= end; k++) {

                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = " + maxsum);

    }

    public static void main(String[] args) throws Exception {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxsubarraysum(numbers);
    }
}
