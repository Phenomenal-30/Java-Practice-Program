import java.util.*;
public class ThrowExceptionForPositiveNumber {
    static void check(int a){
        if (a>0){
            throw new ArithmeticException("Number is positive");
        }
        else{
            System.out.println(a);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        check(num);
    }
}
