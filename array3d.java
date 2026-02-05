public class array3d {

    public static void main(String[] args) {
        int[][][] arr={
            {{1,2},{4,5},{7,8}},
        {{2,3},{3,4},{5,6}},
        {{1,2},{3,5},{9,5}}
    };
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            for(int k=0;k<arr[i][j].length;j++){
                System.out.println(" element at "+i+" , "+j+ " , "+k+ " is "+arr[i][j][k]);
            }
        }System.out.println(" ");

    }System.out.println(" ");

    }
    
}
