import java.util.*;
public class LuckyNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[][]={{3,7,8},{9,11,13},{15,16,17}};
        int num;
        int abs;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                num=arr[i][j];
                abs=arr[i][j];

            }
        }
    }
}
//PSeudocode
/*for(int i=0;i<r;i++)
{
	int min =0;
	for(int j=1;j<c;j++)
	{
		
		if(arr[i][j]<arr[i][min])
			min =j;
	}//inner for j
	int max =0;
	for(int k =1;k<r;k++)
	{
		if(arr[k][min]>arr[max][min]
			max=k;
	}//inner for k
	if(max==i)
	System.out.println(arr[i])
}//outer for i*/