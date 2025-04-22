import java.util.*;
public class MenuDrivenBinToOther {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1 for Binary to decimal");
        System.out.println("Press 2 for Decimal to binary");
        int b=sc.nextInt();
        switch(b){
            case 1:
                int a=sc.nextInt();
                int pow=0;
                int sum=0;
                int d=0;
                while(a>0){
                    d=a%10;
                    sum=sum+d*((int)(Math.pow(2,pow)));
                    pow+=1;
                    a=a/10;
                }
                System.out.println("Decimal Number is "+sum);
                break;
            case 2:
                int c=sc.nextInt();
                int rem;
                String xyz="";
                while(c>0){
                    rem=c%2;
                    c=c/2;
                    xyz=String.valueOf(rem)+xyz;
                }
                System.out.println("Decimal to binary is "+xyz);
                break;
        }
        sc.close();
    }    
}
