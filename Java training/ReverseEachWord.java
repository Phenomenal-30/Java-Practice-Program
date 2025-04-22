import java.util.*;
public class ReverseEachWord {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str+" ";
        int len=str.length();
        String a="";
        String b="";
        for (int i=0;i<len;i++){
            a=str.charAt(i)+a;
            char c=str.charAt(i);
            if (c==' '){
                a=a.trim();
                b+=a;
                b+=" ";
                a="";
            }
        }
        System.out.println(b);

    
}
}
