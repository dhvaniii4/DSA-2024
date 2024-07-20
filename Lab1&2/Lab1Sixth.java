import java.util.*;
class Lab1Sixth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number to find factors: ");
        n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+"\t");
            }
        }
    }
}