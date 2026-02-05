// Anshika Mishra
// 2400320100227

public class array2d {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
        {4,5,6}};
        System.out.println("array is :");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(" element at "+i+" , "+j+ " is "+arr[i][j]);
            }
            System.out.println();
        }
    }  
}
