import java.util.*;
public class Array5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter elements of array:");
        for (int j=0;j<size;j++){
            arr[j]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if (i==arr[i]){
                System.out.println(i);
            }
        }
        sc.close();

    }
}
