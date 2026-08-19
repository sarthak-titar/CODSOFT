// Write a function to find if a number is a palindrome or not. Take number as parameter
import java.util.Scanner;
public class palindrome {
    static void palindromef(int n){
        int o =n;
        int s;
        int f = 0;
        while(o > 0){
            s = o % 10;
            f = f*10+s;
            o =o/10;
        }
        if (n==f){
            System.out.println("pal");
        }
        else{
            System.out.println("not");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        palindromef(n);
    }
    
}
