import java.util.*;
public class MultiplyMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows of matrix 1:");
        int a=sc.nextInt();
        System.out.println("Enter number of columns of matrix 1:");
        int b=sc.nextInt();
        System.out.println("Enter number of rows of matrix 2:");
        int c=sc.nextInt();
        System.out.println("Enter number of columns of matrix 2:");
        int d=sc.nextInt();
        if (b==c){
            int arr1[][]=new int [a][b];
            int arr2[][]=new int [c][d];
            for(int i=0;i<a;i++){
                for(int j=0;j<b;j++){
                    arr1[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<c;i++){
                for(int j=0;j<d;j++){
                    arr2[i][j]=sc.nextInt();
                }
            }
            



        }
        else{
            System.out.println("Matrix multiplication is not possible.");
        }
    }
}
