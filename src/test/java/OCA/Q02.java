package OCA;

public class Q02 {
    public static void main(String[] args) {
        int i =10;
        int j=20;//firstly j=20
        int k=(j+=i)/5;//j=j+i==> j=30, so 30/5=6, and k=6
        System.out.println(i + ":" +j+ ":" + k);
        //                 10 + :  30   :  6
    }
}
