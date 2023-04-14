package uniqueelement;

public class Q02 {

        /*
        Type code to find the sum of the unique digits of an integer
         */
    public static void main(String[] args) {
        int p = 1213345515;
        String strP=String.valueOf(p);
        String uniqueNum="";
        for (int i = 0; i <strP.length() ; i++) {
            if(strP.indexOf(strP.charAt(i)) == strP.lastIndexOf(strP.charAt(i))){
                uniqueNum+=(strP.charAt(i));
            }

        }
        System.out.println( uniqueNum);//24

        int sum=0;
        for (int i = 0; i <uniqueNum.length() ; i++) {
            sum+=Integer.valueOf(uniqueNum.substring(i,i+1));
        }

        System.out.println(sum);


        System.out.println();
        System.out.println("**************** 2. way**************");

        int p1 = 1213345515;//2 and 4 are unique
        String strP1 =String.valueOf(p1);

        int sum1=0;
        for (int i = 0; i <strP1.length() ; i++) {
            if (strP1.indexOf(strP1.charAt(i)) == strP1.lastIndexOf(strP1.charAt(i))) {

                sum1 = sum1 + Integer.valueOf((strP1.substring(i, i + 1)));

            }

        }

        System.out.println(sum1);//2+4=6




    }







    }

