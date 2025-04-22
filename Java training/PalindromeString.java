import java.util.*;
public class PalindromeString{
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
        if (str.equalsIgnoreCase(a))
        System.out.println("Palindrome string");
        else 
        System.out.println("Not a palindrome string");
}
}