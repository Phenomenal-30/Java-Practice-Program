import java.util.*;
public class Pattern {
    void p1(String a,int b){
        for(int i=1;i<=b;i++){
            for (int j=1;j<=i;j++)
                System.out.print(a);
            System.out.println("\n");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ab=sc.nextLine();
        int xy=sc.nextInt();
        Pattern obj=new Pattern();
        obj.p1(ab,xy);
        sc.close();

    }
}
