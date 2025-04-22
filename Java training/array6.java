//Print intersectin of 2 array
import java.util.*;
public class array6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of 1st array:");
        int size1=sc.nextInt();
        int arr1[]=new int[size1];
        System.out.println("Enter elements of 1st array:");
        for (int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of 2nd array:");
        int size2=sc.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Enter elements of 2nd array:");
        for (int j=0;j<size2;j++){
            arr2[j]=sc.nextInt(); 
        }
        for (int i=0;i<size1;i++){
            for (int j=0;j<size2;j++){
                if (arr2[j]==arr1[i]){
                    System.out.println(arr1[i]);
                }
            }
        }
        sc.close();
    }
}
