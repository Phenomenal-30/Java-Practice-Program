import java.util.*;
public class CapitalFirstLetter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String upper="";
        for(int i=0;i<str.length();i++){
            if (i==0){
                String ab=String.valueOf(str.charAt(0));
                upper+=ab.toUpperCase();
            }
            else if(str.charAt(i)==' '){
                upper+=str.charAt(i);
                i+=1;
                String cd=String.valueOf(str.charAt(i));
                upper+=cd.toUpperCase();
            }
            else{
                upper+=str.charAt(i);
            }
            System.out.println(i);
        }
        System.out.println(upper);

    }
    
}
