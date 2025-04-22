public class ImplementLL {
    public static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        void add(int data){
            Node newnode= new Node(data);
            if(head==null){
                head=newnode;
                tail=newnode;
                return;
            }
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;

        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.add(3);
        ll.add(5);
        ll.add(2);
        ll.add(7);
        ll.add(9);
        ll.display();

    }
    
}
