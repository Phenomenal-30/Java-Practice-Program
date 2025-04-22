//import java.lang.Thread;
public class Thread2 implements Runnable{
    public void run(){
        System.out.println("Multithreading in java");
    }
    public static void main(String args[]){
        Thread2 obj=new Thread2();
        Thread obj1=new Thread(obj);
        obj1.start();
    }
}
