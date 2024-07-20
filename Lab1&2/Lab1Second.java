import java.util.*;
class Lab1Second{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to check odd/even: ");
        n = sc.nextInt();
        if(n%2==0){
            System.out.println("Even!");
        }
        else{
            System.out.println("Odd!");
        }
    }
}