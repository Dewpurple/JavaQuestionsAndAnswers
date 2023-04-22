package arrays;

import java.util.Arrays;

public class General {

    //Java created Arrays structure to be able to store multiple data in it.
    //You can store multiple data in an array, they should be in the same data type

    public static void main(String[] args) {
        int arr[]=new int[6];
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); //[0, 0, 0, 0, 0,0]

        arr[0]=1;
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); //1, 0, 0, 0, 0,0]
        arr[1]=2;
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); //[1, 2, 0, 0, 0,0]
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); //[1, 2, 3, 4, 5,6]

        System.out.println();
        System.out.println("******** How to print a specific element on the console *********** ");
        System.out.println("arr[2] = " + arr[2]);//3

        System.out.println();
        System.out.println("******** How to get the numbers of elements in array *********** ");

        System.out.println("arr.length = " + arr.length);//6

        System.out.println();
        System.out.println("******** print the sum of the first and the last element in array on the console *********** ");

        int sumOfFirstandLastElement= + arr[0] + arr[arr.length - 1];
        System.out.println("sumOfFirstandLastElement = " + sumOfFirstandLastElement);

        System.out.println();
        System.out.println("******** find the sum of the all element in array  *********** ");

        int sum=0;
        for (int i = 0; i < arr.length ; i++) {

            sum+=arr[i];
        }
        System.out.println("sum = " + sum);//21

        System.out.println();
        System.out.println("******** find the sum of the all element in array  with while loop*********** ");

        int sum1=0;
        int i=0;

        while(i< arr.length){
            sum1+=arr[i];
            i++;

        }
        System.out.println("sum1 with while loop= " + sum1);

        System.out.println();
        System.out.println("******** find the sum of the all element in array  with do while loop*********** ");

        int sum2=0;
        int k=0;

        while(k< arr.length){
            sum2+=arr[k];
            k++;

        }
        System.out.println("sum2 with do while loop= " + sum2);


        System.out.println();
        System.out.println("******** find the sum of the all element in array  with for each loop*********** ");

        int sum3=0;
        for(int w:arr){
            System.out.print("w = " + w);//1 2 3 4 5 6
            sum3+=w;
        }
        System.out.println("sum3 with for each loop = " + sum3);




    }

}
