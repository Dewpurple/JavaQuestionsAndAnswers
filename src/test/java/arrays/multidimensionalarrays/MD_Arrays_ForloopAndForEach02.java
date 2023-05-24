package arrays.multidimensionalarrays;

public class MD_Arrays_ForloopAndForEach02 {

    public static void main(String[] args) {
        int[][] a= {{9, 2, 31}, {5, 4}, {8}, {10, 6}};

        int z=97;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
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