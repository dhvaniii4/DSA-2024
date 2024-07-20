import java.util.*;
class Lab1Fourth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int fact=1;
        System.out.println("Enter number to find factorial: ");
        n = sc.nextInt();
        if(n==1||n==0){
            System.out.println("Factorial: "+fact);
        }
        for(int i = n;i>=1;i--){
            fact *=i;
        }
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}