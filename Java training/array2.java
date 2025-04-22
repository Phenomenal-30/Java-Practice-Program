//Program to print user input array element that is divisible by 5
import java.util.*;
public class array2{
    public static void main(StringFunction args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements in array");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            if (arr[i]%5==0){
                System.out.println(arr[i]);

            }
        }           
        
    }
    
}

