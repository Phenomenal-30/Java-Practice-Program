//Program to calculate area of rectangle and circle using method overloading
import java.util.Scanner;

public class Shape{
    static double length,breadth,radius;
    final double pi=3.14;
    Shape(){
        length=0;
        breadth=0;
        radius=0;
    }
    double area(double r){
        double area=pi*r*r;
        //System.out.println("Area of circle is:"+area);
        return area;
    }
    double area(double l,double b){
        double area=l*b;
        //System.out.println("Area of Rectangle is:"+area);
        return area;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Shape obj=new Shape();
        length=sc.nextDouble();
        breadth=sc.nextDouble();
        radius=sc.nextDouble();
        double res=obj.area(length,breadth);
        double res1=obj.area(radius);
        System.out.println("Arae of rectangele "+res+" Area of circle "+res1);
        sc.close();
    }


    
    
}
