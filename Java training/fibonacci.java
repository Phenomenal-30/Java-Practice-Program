import java.util.*;
public class fibonacci{
    void fibo(int a){
        int b=0;
        int c=1;
        for (int i=0;i<a;i++){
            System.out.println(b);
            int d=c+b;
            b=c;
            c=d;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number till you want the series");
        int n=sc.nextInt();
        fibonacci obj=new fibonacci();
        obj.fibo(n);

    }
}