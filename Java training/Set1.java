import java.util.*;

public class Set1 {
    public static void main(String[] args){

        ArrayList<Integer> L1 = new ArrayList<Integer>();
        ArrayList<Integer> L2 = new ArrayList<Integer>();
        Collection<Integer> a = new HashSet<Integer>();
        Collection<Integer> b = new HashSet<Integer>();
        L1.add(10);
        L1.add(30);
        L1.add(100);
        a.addAll(L1);
        L2.add(30);
        L2.add(100);
        L2.add(11);
        b.addAll(L2);
        a.addAll(b);
        System.out.println("Union");
        for(Integer number : a){
            System.out.println("NUMBER :"+number);
        }
        a.retainAll(b);
        System.out.println("Intersection");
        for(Integer number : a){
            System.out.println("NUMBER :"+number);
        }
        a.add(99);
        a.add(567);
        a.removeAll(b);
        System.out.println("Difference");
        for(Integer number : a){
            System.out.println("NUMBER :"+number);
        }
    }
}