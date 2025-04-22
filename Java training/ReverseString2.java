import java.util.*;
public class ReverseString2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        String a="";
        for (int i=0;i<len;i++){
            //char ch=str.charAt(i);
            //a=a+ch;
            a=str.charAt(i)+a;
        }
        System.out.println(a);

    }
}