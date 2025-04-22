import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num =sc.nextInt();
        int a=1,b=1;
        while (a<=num){
            b*=a;
            a+=1;
        }
        
        System.out.println("Factorial is "+b);
    }
    
}
