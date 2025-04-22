import java.util.*;
public class NoOfWord {
    public static void main(String args[]){
        //Can Write your own code that is more optimize than in following;
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        a=a.trim();  //To remove extra space at end
        if (a.isEmpty())
        count=0;
        else{
            a=a+" ";
           }   //To add extra space at end to get count right
        int len=a.length();
        for (int i=0;i<len;i++){
            char ch=a.charAt(i);
            if (ch==' '){
                count++;
            }
        }
        System.out.println("No of words are: "+count);
        sc.close();


        /*
        This code will give wrong answer if string is empty
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=1;
        int len=a.length();
        for (int i=0;i<len;i++){
            char b=a.charAt(i);
            if (b==' ')
            count+=1;
        }
        System.out.println("No of words are: "+count);
        sc.close();*/

    }
}
