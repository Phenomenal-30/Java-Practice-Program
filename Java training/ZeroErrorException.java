import java.util.*;
public class ZeroErrorException{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        try{
            System.out.println("Result is "+a/b);
        }
        catch(ArithmeticException p){
            System.out.println("Cannot divide by zero");
        }
    }
}