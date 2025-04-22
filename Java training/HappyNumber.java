import java.util.*;
public class HappyNumber {
    ArrayList<Integer> list=new ArrayList<Integer>();
    Set<Integer> set = new HashSet<Integer>(list);
    void square(int n){
        int sum=0;
        int d=0;
        while(n>0){
            d=n%10;
            sum=sum+(int)(Math.pow(d,2));
            n=n/10;          
        }
        list.add(sum);
        if(set.size() < list.size()){
            System.out.println("Not a happy number");
        }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        

    }
}
