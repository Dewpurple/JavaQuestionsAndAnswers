package OCA;

public class Q08 {
    public static void main(String[] args) {
        int ii=0;
        int jj=7;

        for ( ii = 0; ii <jj ; ii+=2) {//
                    //0<7==>T  0+2
                    //2<7==>T  2+2
                   //4<7==>T  4+2
                   //6<7==>T  6+2
                  //8<7==>False
            System.out.print(ii+ " ");//0 2 4 6
        }
    }
}
