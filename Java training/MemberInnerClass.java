import java.util.*;
class MemberInnerClass{
    String name="Java";
    int age=18;
    class Class2{
        void display(){
            System.out.println(name+" "+age);
        }
    }
    public static void main(String args[]){
        MemberInnerClass obj=new MemberInnerClass();
        MemberInnerClass.Class2 obj2=obj.new Class2();
        obj2.display();
    }
}