package arrays.multidimensionalarrays;

public class MD_Arrays_ForloopAndForEach {

    public static void main(String[] args) {


    int[][] a = new int[3][2];//[[8,10],[7,5],[11,3]]

    a[0][0] = 8;
    a[0][1] = 10;
    a[1][0] = 7;
    a[1][1] = 5;
    a[2][0] = 11;
    a[2][1] = 3;

    int z=97;
        for (int i = 0; i <a.length-1 ; i++) {
        for (int j = 0; j <a.length-1 ; j++) {
            a[i][j]=z;
        }

    }

        for(int w[]:a){
        for (int n:w){
            System.out.println(n);
        }

    }


}
    }