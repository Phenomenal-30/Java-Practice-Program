import java.util.*;
public class CountBeforeH{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        int len=str.length();
        for(int i=0;i<len;i++){
            if (str.charAt(i)=='H' || str.charAt(i)=='h'){
                break;
            }
            else{
                count+=1;
            }        
        }
        if (count==0){
            System.out.println("No H chracter is found in the string");
        }
        else{
            System.out.println("i + "+count);
        }
    }

}