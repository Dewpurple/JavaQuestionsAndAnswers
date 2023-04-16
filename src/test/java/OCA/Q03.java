package OCA;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {
        int num [] []= new int [1] [3];//[[0,0,0]]
        for (int i = 0; i <num.length ; i++) {//num.length=1
                    //    0<1==>True
                   //    1<1==>False
            for (int j = 0; j <num[i].length ; j++) {
                    //    0<3==> True
                    //    1<3==> True
                    //    2<3==> True
                   //     3<3==> False
                num[i][j]=10;
                //num[0][0]=10
                //num[0][1]=10
                //num[0][2]=10
                //num[0][3]=10

            }
        }
        System.out.println(Arrays.deepToString(num));//[[10, 10, 10]]


    }
}
