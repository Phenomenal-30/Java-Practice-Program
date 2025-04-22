import java.util.*;
public class BasicCalculatorLocalInnerClass {
    static int a,b;
    static String opr;
    BasicCalculatorLocalInnerClass(int num1,int num2,String operator){
        a=num1;
        b=num2;
        opr=operator;
    }
    //Method can be defined outside of main function also for local inner class
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        String op=sc.next();
        class Arithmetic{
            void add(int num1,int num2){
                System.out.println(num1+num2);
            }
            void sub(int num1,int num2){
                System.out.println(num1-num2);
            }
            void mul(int num1,int num2){
                System.out.println(num1*num2);
            }
            void div(int num1,int num2){
                System.out.println(num1/num2);
            }
            
        }
        BasicCalculatorLocalInnerClass obj2=new BasicCalculatorLocalInnerClass(num1,num2,op);
        Arithmetic obj=new Arithmetic();
        if (opr.equals("+")){
            obj.add(a,b);
        }
        else if(opr.equals("-")){
            obj.sub(a,b);
        }
        else if (opr.equals("*")){
            obj.mul(a,b);
        }
        else if(opr.equals("/")){
            obj.div(a,b);
        }
        else{
            System.out.println("Enter correct choice");
        }
        sc.close();
    }
}
    

