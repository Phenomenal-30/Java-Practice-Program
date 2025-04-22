class Exception{
    public static void main(String args[]){
        int x=-100;
        try{
            int ans=x/0;
        }
        catch(ArithmeticException p){
            System.out.println(p);
            System.out.println(10000);
        }
        finally{
            System.out.println("This block is executed");
        }
        int c=10+10;
        System.out.println(c);
    }
}