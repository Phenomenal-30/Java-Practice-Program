abstract class Z{
    abstract void show();
}
class Anonymous{
    public static void main(String args[]){
        Z obj=new Z(){
            void show(){
                System.out.println("Hello"); 
            }
        };
        obj.show();
    }
}