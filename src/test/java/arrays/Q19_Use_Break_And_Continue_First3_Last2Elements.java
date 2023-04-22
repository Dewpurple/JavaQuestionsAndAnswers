package arrays;

public class Q19_Use_Break_And_Continue_First3_Last2Elements {

    /*
    //Print just last two elements--use continue

     */

    public static void main(String[] args) {
        int arr[] = {3, 1, 7, 9, 4, 23, 12};

        for (int i = 0; i < arr.length ; i++) {
            if(i<arr.length-2){//0<5 t, 1<5 t, 2<5 t, 3<5 t, 4<5 t, (SKIP)
                continue;
        }
            System.out.print("\n arr[i] = \n" + arr[i]);//23 12
        }
        System.out.println();
        System.out.println("***** Print just first three elements --use break");

        for (int i = 0; i <arr.length ; i++) {
            if(i>2){//0>2 f, 1>2 f, 2>2f, 3>2 t
                break;//3 1 7
            }
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}
