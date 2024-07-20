//Factorial using Recursion: 
import java.util.*;
class Lab1Fifth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number to find factorial: ");
        n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("Factorial: "+ans);
    }
    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}