package arrays;
import java.util.Scanner;
import java.util.Arrays;
public class reverse {
    static void rev(int arr[]){
        for (int i = arr.length-1; i >= 0; i--){
           
            System.out.print(arr[i]+" ");
        }
    }
    

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
       
        int [] arr = new int[size];
        System.out.println("enter array elements");
        for(int i = 0 ; i< size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("befor reverse ");
        System.out.println(Arrays.toString(arr));

        rev(arr);
    }
    
}
