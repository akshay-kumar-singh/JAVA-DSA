import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

      

        //PRINT REVERSE=>O[N]
         for(int i = list.size()-1; i>=0; i--){
                System.out.print(list.get(i)+" ");
         }
        System.out.println();
    }
}

