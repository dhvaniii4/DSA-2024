import java.util.*;
class Second{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m;
    int n;
    int sum=0;
    System.out.println("Enter First number: ");
    m = sc.nextInt();
    System.out.println("Enter second number: ");
    n = sc.nextInt();
    if(m>n){
        for(int i = n;i<=m;i++){
            sum+=i;
        }
    }
    else if(m<n){
        for(int i = m;i<=n;i++){
            sum+=i;
        }
    }
    else{
        System.out.println("Enter two different numbers!");
    }
    System.out.println("Sum = "+sum);
}
}