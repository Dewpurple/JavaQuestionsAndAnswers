package arrays.multidimensionalarrays;

public class Q03_SumOfNumbersOfElementsStringMD {
    //Find the total number of elements in md_arr1
    public static void main(String[] args) {
        String md_arr1[][] = { {"learn", "java", "it"}, {"is", "easy"} };

        int sum=0;
        int cont=0;
        for(String [] w:md_arr1){
      //      System.out.println(w.length);//3 2
            sum+=w.length;
            for(String n:w){
              System.out.print(n.length()+ " ");//5 4 2 2 4
                cont+=n.length();
            }
        }
        System.out.println("sum = " + sum);//5
        System.out.println("cont = " + cont);

        System.out.println();
        System.out.println("***********compare with one dimensional arrays ****************8");
        String [] arr={"learn", "java", "it", "is", "easy"};

        for(String w:arr){
            System.out.print(w.length()+ " ");//5 4 2 2 4
        }

        System.out.println();
        System.out.println("***********integer MD ****************8");

        int [][] md_a={{1,2,3}, {4,5,6}};

        int s=0;
        for(int [] w:md_a){
            for (int n:w){
                System.out.print(n);

                s+=n;
            }
        }
        System.out.print("sum of int elements = " + s);


    }
}
