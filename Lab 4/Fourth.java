//Lab-4(Fourth): Write a program to delete a number from an array that is already sorted in an 
//ascending order. 
import java.util.*;
class Fourth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter array(in ascending order): ");
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index from which you would like to remove the element: ");
        int pos = sc.nextInt();
        for(int i = pos;i<size-1;i++){
            arr[i] = arr[i+1];
        }
        System.out.println("Final Array: ");
        for(int i = 0;i<size-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}