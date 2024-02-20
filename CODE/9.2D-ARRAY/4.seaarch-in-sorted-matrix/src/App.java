import javax.lang.model.element.ElementVisitor;
import javax.lang.model.util.ElementScanner14;

public class App {

    public static boolean staircasesearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;

        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("found key at (" + row + "," + col +")");
                return true;
            }

            else if(key < matrix[row][col]){
                col--;
            }
            
            else{
                row++;
            }
            
        }

        System.out.println("keey not found!");
        return false;
    }
    public static void main(String[] args) throws Exception {
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,39,48},
                          {32,33,39,50}};

        int key = 33;       
        staircasesearch(matrix, key);           

    }
}
