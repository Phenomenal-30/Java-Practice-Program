import java.util.*;
public class GoodNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean bool=false;
        int d=0;
        int sum=0;
        while(a>0){
            d=a%10;
            if (d>sum){
                bool=true;
            }
            else{
                bool=false;
            }
            sum+=d;
            a=a/10;
        }
        if (bool==true){
            System.out.println("Good number");
        }
        else{
            System.out.println("Not a good number");
        }
    }
    
}
