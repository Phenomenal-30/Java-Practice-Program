import java.util.*;
public class Sumofevenodd{
    public static void main(StringFunction args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int evenSum=0, oddSum=0;
        while (num>0){
            int d=num%10;
            if (d%2==0){
                evenSum+=d;
            }
           else{
                oddSum+=d;
           }
           num=num/10;
        }
        System.out.println("Even sum is:"+evenSum);
        System.out.println("Odd Sum is:"+oddSum);
        

    }
}