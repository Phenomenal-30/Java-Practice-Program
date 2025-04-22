import java.util.*;
public class SeatBerth {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your seath number");
        int a=sc.nextInt();
        if (a==0 || a<0){
            System.out.println("Enter correct seat number");
        }
        else if(a>80){
            System.out.println("Seat number is out of range");
        }
        else{
            int rem=a%8;
            if (rem==0){
                System.out.println("Your berth is side upper");
            }
            else if(rem==1){
                System.out.println("Your berth is lower");
            }
            else if(rem==2){
                System.out.println("Your berth is middle");
            }
            else if(rem==3){
                System.out.println("Your berth is upper");
            }
            else if(rem==4){
                System.out.println("Your berth is lower");
            }
            else if(rem==5){
                System.out.println("Your berth is middle");
            }
            else if(rem==6){
                System.out.println("Your berth is upper");
            }
            else if(rem==7){
                System.out.println("Your berth is side lower");
            }

        }
    }
    
}
