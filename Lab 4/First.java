import java.util.*;
class First{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size+1];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter index at which you want to insert: ");
        int pos = sc.nextInt();
        System.out.println("Enter number you want to add: ");
        int num = sc.nextInt();
        for(int i = size;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = num;
        for(int i = 0;i<size+1;i++){
            System.out.println(arr[i]);
        }
    }

}