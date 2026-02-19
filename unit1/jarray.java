public class jarray {

    public static void main(String[] args) {
        int[][] jagged=new int[2][];
        jagged[0]=new int[2]; // 2 elements in row 0
        jagged[1]=new int[3]; // 2 elements in row 1

        jagged[0][0]=10;
        jagged[0][1]=20;
        jagged[1][0]=30;
        jagged[1][1]=40;
        jagged[1][2]=50;

        System.out.println("jadded array : ");
        for(int i=0;i<jagged.length;i++){
            for(int j=0;j<jagged[i].length;j++){
                System.out.println(jagged[i][j]);
            }
            System.out.println();
        }         
    }
}
