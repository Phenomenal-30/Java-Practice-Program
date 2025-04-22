import java.util.*;
public class ArrangeStringWithNumberAtEnd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ",0);
        String arrNew[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String found=String.valueOf(arr[i]);
            int len=found.length();
            char a=found.charAt(len-1);
            String abcd=String.valueOf(a);
            int num=Integer.valueOf(abcd);
            arrNew[num-1]=arr[i];
        }
        String strNew="";
        for(int i=0;i<arrNew.length;i++){
            strNew+=arrNew[i]+" "; 
        }
        System.out.println(strNew);

    }
    
}
