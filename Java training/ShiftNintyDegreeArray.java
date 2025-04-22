public class ShiftNintyDegreeArray {
    public static void main(String args[]){
        int[][] arr={{1,2,3},{8,9,4},{7,6,5}};
        for(int i=0;i<3;i++){
            for(int j=2;j>=0;j--){
                System.out.print(arr[j][i]);
            }
            System.out.println();
        
        }   
    }
    
}
