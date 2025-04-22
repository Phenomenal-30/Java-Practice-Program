abstract class Abstract2 {
    abstract float area();
    abstract float perimeter();
}
class Circle extends Abstract2{
    float radius;
    Circle(float r){
        radius=r;
    }
    float area(){
        float ans= 3.14f*radius*radius;
        return ans;
    }
    float perimeter(){
        float ans=2*3.14f*radius;
        return ans;
    }
}
class Rectangle extends Abstract2{
    float length,breadth;
    Rectangle(float l,float b){
        length=l;
        breadth=b;
    }
    float area(){
        float ans=length*breadth;
        return ans;
    }
    float perimeter(){
        float ans=2*(length+breadth);
        return ans;
    }
}
class Driver2{
    public static void main(String args[]){
        Circle obj=new Circle(5.5f);
        float a=obj.area();
        float b=obj.perimeter();
        Rectangle obj2=new Rectangle(4.5f,6.2f);
        float c=obj2.area();
        float d=obj2.area();
        System.out.println(a+" "+b);
        System.out.println(c+" "+d);

    }
}
