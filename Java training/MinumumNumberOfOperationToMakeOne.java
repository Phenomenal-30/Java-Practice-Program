//use operation 1-Add one 2-Sub 1 3-Div by 2
import java.util.*;
public class MinumumNumberOfOperationToMakeOne {
 public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int count=0;
    while(a!=1){
        if (a%2==0){
            a=a/2;
            count++;
        }
        else{
            a=a-1;
            count++;
        }
    }
    System.out.println(count);
 }  
}
