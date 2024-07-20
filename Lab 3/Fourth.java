import java.util.*;
class Fourth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int smallestIndex = 0;
        int largestIndex = 0;
        int[] arr = new int[n];
        System.out.println("Enter size of array: ");
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1;i<=n;i++){
            if(arr[i]<arr[smallestIndex]){
                smallestIndex = i;
            }
        }
        System.out.println("smallest: "+smallesIndex);
        for(int i = 1;i<=n;i++){
            if(arr[i]>arr[largestIndex]){
                largestIndex = i;
            }
        }
        System.out.println("largest: "+largestIndex);
    }
}