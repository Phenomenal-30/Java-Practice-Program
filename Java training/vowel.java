import java.util.*;
public class vowel {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        str=str.toLowerCase();
        for (int i=0;i<len;i++){
            char ch=str.charAt(i);
            if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
            System.out.println(ch);
        }
    }
    
}
