public class Basicll {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        
    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        a.next=b;
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(b.next);

    }
}
