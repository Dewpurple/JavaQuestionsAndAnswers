package overloadingandoverridding;

public class Overloading04_FemaleMale {

 /*
    Print "Boy" if the gender is "Male" (Ignore cases)
    Print "Girl" if the gender is "Female" (Ignore cases)
    Print "Others" if the gender is different from "Male" and "Female"
     */

    public static String getGender(String gender){

        switch (gender.toLowerCase()) {
            case "male":
                System.out.println("Boy");
                break;
            case "female":
                System.out.println("Girl");
                break;
            case "others":
                System.out.println("LGBTQ");
                break;
            default:
                System.out.println("please write \"Male \"Female or \"Others");
                break;
        }
        return gender;


    }

    public static String getGender(String gender, int age){

        if(gender.equalsIgnoreCase("male")){
            if(age<20){
                System.out.println("Boy");
            }else{
                System.out.println("Man");
            }
        }else if(gender.equalsIgnoreCase("female")) {
            if (age < 20) {
                System.out.println("Girl");

            } else {
                System.out.println("Woman");
            }

        }else if(gender.equalsIgnoreCase("others")){
            System.out.println("LGBTQ");
        }else{
            System.out.println("Write one of them Male  Female Others");
        }
        return "gender";
    }


    public static void main(String[] args) {
        getGender("male");

        getGender("male",18);
    }






}
