import java.util.*;
class CalculatorUsingStaticInnerClass{
    static class Mathutil{
        void add(int x,int y){
            System.out.println(x+y);
        }
        void sub(int x,int y){
            System.out.println(x-y);
        }
        void mul(int x,int y){
            System.out.println(x*y);
        }
        void div(int x,int y){
            System.out.println(x/y);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        String choice=sc.nextLine();
        CalculatorUsingStaticInnerClass.Mathutil obj=new CalculatorUsingStaticInnerClass.Mathutil();
        if(choice.equals("1")){
            obj.add(a,b);
        }
        else if(choice.equals("2")){
            obj.sub(a,b);
        }
        else if(choice.equals("3")){
            obj.mul(a,b);
        }
        else if(choice.equals("4")){
            obj.div(a,b);
        }
        else {
            System.out.println("Enter correct choice");
        }

    }
}