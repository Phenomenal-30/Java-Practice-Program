import java.util.*;
public class ExceptionThrow {
    static void print(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            try{    
                throw new ArithmeticException("String contains vowels");
            }
            catch(ArithmeticException a){
                System.out.println(a);
            }
        }   
        else {
            System.out.println(ch);
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
