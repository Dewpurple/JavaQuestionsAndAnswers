package loops;

public class Q08_WithAsterix_ADouble {
    /*
    Type code to print digits just in the decimal part of the given decimal number with an
    asterix. For example; 75.4238 Ş *4*2*3*8
     */
    public static void main(String[] args) {

        double num=75.4238;
        String newStrNum=String.valueOf(num);
        String withOutDot= newStrNum.replace(".", " ");

        String digitsOfNum= withOutDot.split(" ")[1];//4238

        String box="";
        for (int i = 0; i <digitsOfNum.length() ; i++) {
           box+="*"+ digitsOfNum.charAt(i) ;

        }
        System.out.println(box);

        System.out.println();
        System.out.println("******  2.way ******");

        double num2=75.4238;
        String newStrNum2=String.valueOf(num2);

     //   System.out.println(newStrNum2.indexOf("."));//index number is 2 for "."
        int newStrNumDOT= newStrNum2.indexOf(".");

        String box2="";
        for (int i = newStrNumDOT+1; i <newStrNum2.length() ; i++) {
            box2+="*" + newStrNum2.charAt(i);
        }
        System.out.println(box2);
    }



    }

