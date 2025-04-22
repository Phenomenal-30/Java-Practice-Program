import java.util.*;
import java.lang.Exception;
class ThreadYoutube implements Runnable{
    public void run(){
        System.out.println("Started");
    }
    public static void main(String[] args) {
        ThreadYoutube obj=new ThreadYoutube();
        Thread t=new Thread(obj);
        t.start();
        System.out.println(t.getName());
        t.setName("Good morning");
        System.out.println(t.getName());
        System.out.println(t.getId());
        try{
            t.sleep(2000);
        }
        catch(Exception e){
            System.out.println("Caught Exception");
        }
        
    }
}