import java.util.*;
public class ExceptionVowelNotFound {
    static void print(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println(ch);
        }
        else {
            try{    
                throw new ArithmeticException("String does not contains vowels");
            }
            catch(ArithmeticException a){
                System.out.println(a);
            }
        } 
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            print(str.charAt(i));
        }
    }
}
