import java.util.*;
public class Exception3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            String a=sc.nextLine();
            int b=Integer.parseInt(a);
            System.out.println("Value of num is "+b);
        }
        catch(NumberFormatException p){
            System.out.println("Enter correct value");
        }
    }
}
