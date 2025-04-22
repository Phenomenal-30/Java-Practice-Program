import java.util.*;
public class RevesreStringUsingStack {
    public static void main(String args[]){
        String sc="Sanyam";
        Stack<Character> str=new Stack<Character>();
        for(int i=0;i<sc.length();i++){
            str.push(sc.charAt(i));
        }
        while(!str.empty()){
            char ch = str.pop();
            System.out.print(ch);
        }
        System.out.println("");
        /*Iterator j=str.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }*/
    }
    
}
