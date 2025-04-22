import java.util.*;
public class ReverseString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        String a="";
        for (int i=len-1;i>=0;i--){
            //char ch=str.charAt(i);
            //a=a+ch;
            a=a+str.charAt(i);
        }
        System.out.println(a);
    
}
}
