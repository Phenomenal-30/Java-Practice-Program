import java.util.*;
public class ReverseOfInt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b="";
        for(int i=0;i<a.length();i++){
            b=a.charAt(i)+b;
        }
        System.out.println("Reversed number is:"+b);
        //System.out.println(Integer.valueOf(b));
    }
}