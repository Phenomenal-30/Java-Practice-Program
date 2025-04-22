import java.util.*;
public class PrimeFunc {
    int c=0;
    int isPrime(int a){
        for (int i=2;i<=a/2;i++){
            if (a%i==0)
            c++;
        }
        if (c==0)
        return 1;
        else
        return 0;
    }    

    public static void main(StringFunction args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements in array");
        PrimeFunc obj=new PrimeFunc();
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            int ans=obj.isPrime(arr[i]);
            if (ans==1)
            System.out.println(arr[i]+" ");
        }

    }
}