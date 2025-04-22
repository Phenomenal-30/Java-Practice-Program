class A{
    int x=0;
    void display(){
        System.out.println(x);
    }
}
class B extends A{
    int y=10;
    void display(){
        System.out.println(y);
    }
}
class Inheritance extends B{
    int z=30;
    void display(){
        System.out.println(z);
        super.display();
        //System.out.println(super.display());
    }
    public static void main(String args[]){
        Inheritance obj=new Inheritance();
       // obj.super.display();
        obj.display();
    }
}