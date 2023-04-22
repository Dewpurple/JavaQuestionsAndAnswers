package arrays;

public class Q20_FromIndex2_to_Index4 {
    /*
      int arr[] = {3, 1, 7, 9, 4, 23, 12};
       //Print the elements from index 2 to index 4

     */

    public static void main(String[] args) {
        int arr[] = {3, 1, 7, 9, 4, 23, 12};

        for (int i = 0; i <arr.length ; i++) {
            if(i<2){      //0<2 t, 1<2 t, 2<2 f, 3<2 f,  4<2 f , 5<2 f, 6<2 f (if there is True, True is Skip)
                continue;//                 7,     9,    4,       23     12
            }
                if(i>4){//0>4 f, 1>4 f, 2>4 f, 3>4 f, 4>4 f
                break;//    3      1     7      9      4
            }
            System.out.println("arr[i] = " + arr[i]);
        }

    }
}
