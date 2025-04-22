//Print the sum of 2D array of each row separately
import java.util.*;
public class array3 
{
    public static void main(StringFunction args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        int arr[][]=new int[rows] [columns];
        System.out.println("Enter elements in array");
        for (int i=0;i<rows;i++){
            int sum=0;
            for (int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
            }
            int b=i+1;
            System.out.println("Sum of "+b+" row is "+sum);
        }

    }   
}
