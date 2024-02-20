import java.util.*;;

public class App {

    public static int storewater(ArrayList<Integer> height){
        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp){
            //calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currwater = ht * width;
            maxwater = Math.max(maxwater, currwater);

            //update ptr
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> height = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storewater(height));
    }
    
}
