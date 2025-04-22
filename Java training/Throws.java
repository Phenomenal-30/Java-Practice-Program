class Throws{
    void display() throws ClassNotFoundException{
        System.out.println("Hello");
    }
    public static void main(String args[]){
        Throws obj=new Throws();
        try{
            obj.display();
        }
        catch(ClassNotFoundException a){
            System.out.println(a);
        }
    }
}