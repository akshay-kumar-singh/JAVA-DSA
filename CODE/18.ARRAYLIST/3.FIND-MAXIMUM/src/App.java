import java.util.*;;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        //o(n)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            //if(max<list.get(i)){
            //    max = list.get(i);
            //}
            max = Math.max(max, list.get(i));
        }
        System.out.println("max element = "+ max);
            
    }
}
