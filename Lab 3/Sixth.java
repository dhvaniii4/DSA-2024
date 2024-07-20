//Read n numbers in an array then read two different numbers, replace 1st 
//number with 2nd number in an array and print its index and final array.
import java.util.*;
class Sixth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int temp = 0;
        int[] arr = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }  
        System.out.println("Enter index of first number to be replaced: ");
        int num1 = sc.nextInt();
        System.out.println("Enter index of second number to be replaced: ");
        int num2 = sc.nextInt();
        if(num1<arr.length)
        if(num2<arr.length)
        {
            temp=arr[num1];
            arr[num1]=arr[num2];
            arr[num2]=temp;
        }
        System.out.println("Final Array is: ");
        for(int arr1 : arr){
            System.out.println(arr1+" ");
        }
    }
}