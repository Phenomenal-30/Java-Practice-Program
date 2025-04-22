//import java.lang.Thread;
public class Thread4 implements Runnable{
    public void run(){
        System.out.println("Multithreading in java");
    }
    public static void main(String args[]){
        Thread4 obj=new Thread4();
        Thread obj1=new Thread(obj,"Thread");
        obj1.start();
        String str=obj1.getName();
        System.out.println(str);
    }
}
