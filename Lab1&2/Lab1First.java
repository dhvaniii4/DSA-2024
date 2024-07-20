import java.util.*;
class Lab1First{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r;
        System.out.println("Enter radius: ");
        r = sc.nextDouble();
        double area = (Math.PI)*r*r;
        System.out.pritnln("Area of circle with given radius is: "+area);
    }
}