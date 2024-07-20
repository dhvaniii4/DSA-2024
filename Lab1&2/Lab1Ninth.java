import java.util.*;
class Lab1Ninth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long sec,inputsec;
        System.out.println("Enter seconds: ");
        sec = sc.nextLong();
        inputsec=sec;
        long hrs,mins;
        hrs = sec/3600;
        sec = sec%3600;
        mins = sec/60;
        sec = sec%60;
        System.out.println(inputsec+" Entered Sec = "+hrs+" hrs:"+mins+" mins:"+sec+" sec");
    }
}