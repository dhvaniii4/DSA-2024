//LAB-4(Third): Write a program to insert a number in an array that is already sorted in an 
//ascending order. 
import java.util.*;
class Third{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        System.out.println("Enter array(in ascending order): ");
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index at which you would like to insert element?");
        int pos = sc.nextInt();
        System.out.println("Enter the element to insert: ");
        int num = sc.nextInt();
        for(int i = size;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = num;
        System.out.println("Final Array: ");
        for(int i = 0;i<size+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}