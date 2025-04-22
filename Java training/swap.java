//program to swap two variable using function
import java.util.*;
public class swap{
    void swap2(int a,int b) {
        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        swap obj=new swap();
        obj.swap2(x,y);
        System.out.println(x);
        System.out.println(y);
    }    
}
