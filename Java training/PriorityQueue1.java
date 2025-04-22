import java.util.*;
public class PriorityQueue1 {
    public static void main(String args[]){
        PriorityQueue<Integer> arr=new PriorityQueue<Integer>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.offer(40);
        System.out.println("head:"+arr.peek());
        arr.remove();
        System.out.println("head:"+arr.element());
        arr.poll();
        System.out.println("head:"+arr.element());
        arr.remove();
        arr.remove();
        arr.poll();
    }
}
