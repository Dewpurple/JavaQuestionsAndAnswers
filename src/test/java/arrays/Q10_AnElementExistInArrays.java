package arrays;

public class Q10_AnElementExistInArrays {

    /*
    Type code to find if a given element exists in a given array or not
     */

    public static void main(String[] args) {
        String[] arr = {"Apex", "is", "an", "object", "oriented", "programming", "language"};
        String s = "apex";

        int count=0;
        for(String w:arr) {
            if (w.equalsIgnoreCase(s)) {
                count++;
            }
        }
            if(count>0){
                System.out.println("String s exists in arrays");
            }else{
                System.out.println("String s does not exist in arrays");
            }



    }
}
