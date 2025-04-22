//import java.lang.Thread;
public class Thread3 implements Runnable{
    public void run(){
        System.out.println("Multithreading in java");
    }
    public static void main(String args[]){
        Thread3 obj=new Thread3();
        Thread obj1=new Thread(obj);
        String str=obj1.getName();
        System.out.println(str);
    }
}9
