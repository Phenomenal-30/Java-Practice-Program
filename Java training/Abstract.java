abstract class Abstract {
    abstract void show();
    }
class Driver extends Abstract{
    void show(){
        System.out.println("*");
    }
    public static void main(String args[]){
            Driver obj= new Driver();
            obj.show();
        }
}
    