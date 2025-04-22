import java.util.*;
public class Linkedlist1 {
    public static void main(String args[]){
        LinkedList<Integer> a=new LinkedList<Integer>();
        a.add(10);
        a.add(20);
        a.add(30);
        Iterator i=a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println(" ");
        a.remove(0);
        Iterator j=a.iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }
    }    
}
