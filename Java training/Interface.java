interface Hello {
    void show();
    default void free(){
        System.out.println("Free");
    }
}
public class Interface implements Hello{
    public void show(){
        System.out.println("Show");
    }
    public static void main(String args[]){
        Interface obj=new Interface();
        obj.show();
        obj.free();
    }
}
