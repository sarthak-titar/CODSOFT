package arrays;
import java.util.Scanner;
import java.lang.classfile.instruction.StoreInstruction;
import java.util.Arrays;
public class lecture {
    static void sarray(String as[]){
       System.out.println("using for each loop");
        for (String  r : as){
           System.out.print(r+" ");
        }
        System.out.println("\n");
        System.out.println("using to string method");
        System.out.println(Arrays.toString(as));

        // checking String array are mutable or not
        System.out.println("\n");
        System.out.println("changing 0yh element");
        as[0] = "siddhika";
        as[1] = "sahil";
        as[2] = "pise";
        System.out.println(Arrays.toString(as)); 
        System.out.println(as.length);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = 3;
        int [] arr = new int [size];
        
       for (int i = 0 ; i < arr.length ; i++){
       arr[i] = sc.nextInt();
       }
// method one to print array
        for (int i = 0 ;i < arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
// method two to print array
        System.out.println(" \n");
        System.out.println("by using for each loop or enhanced loop");

        for (int a : arr){
            System.out.print(a + " ");
        }
// method three to print array
        System.out.println(" \n");
       System.out.println(" by using Arrays class");
       System.out.println(Arrays.toString(arr));

//  string array
int sizes =3;
String [] as = new String[sizes];
for (int i = 0 ; i < as.length; i++){
   as[i] = sc.nextLine();
}
    sarray(as);

    }
    
}
