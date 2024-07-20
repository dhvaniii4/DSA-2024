// Write a program to find whether the array contains a duplicate number or not.
import java.util.*;
class Fifth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        boolean isDuplicate = false;
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<size-1;i++){
            for(int j = i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    isDuplicate = true;
                    break;
                }
            }
        }
        if(isDuplicate==true){
            System.out.println("Yes, it consists of duplicate elements.");
        }
        else{
            System.out.println("No! It doesn't contain any duplicate elements.");
        }
    }
}