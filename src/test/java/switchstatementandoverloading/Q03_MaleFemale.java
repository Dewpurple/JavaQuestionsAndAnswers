package switchstatementandoverloading;

import java.util.Scanner;

public class Q03_MaleFemale {

    /*
    Print "Boy" if the gender is "Male" (Ignore cases)
    Print "Girl" if the gender is "Female" (Ignore cases)
    Print "Others" if the gender is different from "Male" and "Female"
     */
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Write one of them  Male  Female  Others");
        String gender =input.next();

        getGender(gender);
    }


    public static String getGender(String gender){


        switch (gender.toLowerCase()){
            case "female":
                System.out.println("Girl");
                break;
            case "male":
                System.out.println("Boy");
                break;
            default:
                System.out.println("LGBTQ");
                break;
        }

        return gender;
    }
}
