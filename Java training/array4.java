//print diagonal element of array both left and right
import java.util.*;
public class array4 {
    public static void main(StringFunction args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = sc.nextInt();
        int arr[][]=new int[rows] [columns];
        System.out.println("Enter elements in array");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                arr[i][j]=sc.nextInt();
                if ((i==j || i+j==rows-1)){
                    System.out.println(arr[i][j]);
                }
                /*if (i+j==rows-1){
                    System.out.println(arr[i][j]);
                }
                */
            }
        }
    }
}