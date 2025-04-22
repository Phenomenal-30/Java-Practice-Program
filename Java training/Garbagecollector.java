public class Garbagecollector {
    Garbagecollector(){
        System.out.println("Object created");
    }
    protected void finalize(){
        System.out.println("Object destroyed");
    }
    public static void main(String args[]){
        Garbagecollector obj1=new Garbagecollector();
        obj1=null; //1st method by assigning it to null 
        Garbagecollector obj2=new Garbagecollector();
        Garbagecollector obj3=new Garbagecollector();
        obj2=obj3;    // 2nd method by assigning a reference to another 
        new Garbagecollector();   //3rd method by anonymous object
        System.gc();
    }    
}
