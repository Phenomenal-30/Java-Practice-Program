import java.util.*;
public class array {
    public static void main(StringFunction args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements in array");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }           
        int sum=0;
        for (int i=0;i<size;i++){
            sum+=arr[i];
        }
        System.out.println("Sum is:"+sum);
        
    }
    
}
