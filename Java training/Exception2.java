import java.util.*;
public class Exception2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("Sum is "+(a+b));
        }
        catch(InputMismatchException p){
            System.out.println("Enter integer value");
        }
    }
}

