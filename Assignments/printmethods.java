package arrays;
import java.util.Arrays;
import java.util.List;
public class printmethods {
    public static  void main(String args[]){
        int[] arr = {12,4,3,23,4,77};
        Integer[] arrl = {12,4,3,23,4,77};

        // array class methods 1)tostring  2)aslist 3)deepTostring
        System.out.println("to string method"+"\n"+ Arrays.toString(arr));
        List<Integer> s = Arrays.asList(arrl);
        System.out.println("as list method"+"\n"+s);

        int[][] marr = {{12,12},{14,76}};
        System.out.println("deepTostring"+"\n"+ Arrays.deepToString(marr));

    }
    
}
