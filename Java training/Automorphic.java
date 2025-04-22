import java.util.*;
public class Automorphic {
    static int counter=0;
    static int count(int num){
        while (num>0){
            counter+=1;
            num=num/10;
        }
        return counter;
    }
    

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=count(a);
        int rem=(a*a)%(int)(Math.pow(10,b));
        if (a==rem){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not a automorphic number");
        }

    }
    
}
