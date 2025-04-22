//import java.lang.Thread;
public class Thread1 extends Thread {
    public void run(){
        System.out.println("Multithreading in java");
    }
    public static void main(String args[]){
        Thread1 obj=new Thread1();
        obj.start();
    }
}
