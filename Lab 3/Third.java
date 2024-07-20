import java.util.*;
class Third{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number: ");
        n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum+=i;
        }
        double avg = 0;
        avg = (sum/n);
        System.out.println("Sum: "+sum+"\nAverage: "+avg);
    }
}