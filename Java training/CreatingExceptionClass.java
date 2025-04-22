import java.lang.Exception;
class Absolute extends Exception{
    public Absolute(String str){
        super(str);
    }    
}
public class CreatingExceptionClass{
    static void display(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            try{
                throw new Absolute("Contains vowels");
            }
            catch(Absolute x){
                System.out.println(x);
            }
        }
        else System.out.println(ch);
    }
    public static void main(String args[]){
        String str="Sanyam";
        for(int i=0;i<str.length();i++){
            display(str.charAt(i));
        }
    }
}
