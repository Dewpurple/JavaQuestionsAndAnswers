package ifstatement.namerules;

public class Q01 {

    /*
    Type code to check the grammatical rules for full name
    * First and Last name must be at least 2 characters
    * Your code should print "cannot be skip first and/or last name" for one or more space
    characters like " " or " "
    * Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
    * Your code should print "First name or last name missed" for single words like
    "Ali" or "Can" or "ali"
    * Your code should print "Format error" for all the format like "ALI CAN"
    * Your code should print "Invalid Name" if the name has any character different
    from letters and space.
         */


    public static void main(String[] args) {

        String s = "@fagd adh57";

        String sFullNameCheck = s.replaceAll("[^a-zA-Z ]", "").replaceAll("\\s+", " ").trim();//
        int sFullNameCheckInt = s.replaceAll("[^a-zA-Z ]", "").replaceAll("\\s+", " ").trim().length();
        System.out.println("sFullNameCheck: " + sFullNameCheck);
        System.out.println("sFullNameCheckInt: " + sFullNameCheckInt);

        System.out.println("***************** NO SKIP FULL NAME SPACE CHECK ***************88");
        String spaceCheck = s.replaceAll("[^a-zA-Z]", "");
        int spaceCheckLength = spaceCheck.length();
        System.out.println("spaceCheckLength " + spaceCheckLength);
        System.out.println("spaceCheck " + spaceCheck);

        if (spaceCheckLength <= 1) {
            System.out.println("Space Check Method");
            System.out.println("You cannot skip to write first and last name");
        }


        System.out.println("*****************FIRST AND LAST NAME CHECK ***************88");
        String sFirstName = s.trim().split(" ")[0].replaceAll("[^A-Za-z]", "");
        int sFirstNameLength = sFirstName.length();
        System.out.println(sFirstNameLength);

        String sLastName = s.trim().split(" ")[1].replaceAll("[^A-Za-z]", "");
        int sLastNameLength = sLastName.length();
        System.out.println(sLastNameLength);


        if ((sFirstNameLength < 2)) {
            System.out.println("First Name must be At least 2 characters");
        }

        if ((sLastNameLength < 2)) {
            System.out.println("Last Name must be At least 2 characters");

        }

        System.out.println("******2 INITIALS CHECK UPPERCASE ******* ");
        boolean FirstNameInitialRule = (sFirstName.charAt(0) >= 'A' && sFirstName.charAt(0) <= 'Z');
        boolean LastNameInitialRule = (sLastName.charAt(0) >= 'A' && sLastName.charAt(0) <= 'Z');

        System.out.println("******3 ALL UPPERCASE ARE WRONG ******* ");
        String fNameExceptInitial = s.substring(1, s.indexOf(" "));//li
        String lNameExceptInitial = s.substring(s.indexOf(" ") + 2);//an
        System.out.println("fNameExceptInitial = " + fNameExceptInitial);
        System.out.println("lNameExceptInitial = " + lNameExceptInitial);
        boolean checkFirstNameExceptInitial = fNameExceptInitial.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("checkFirstNameExceptInitial = " + checkFirstNameExceptInitial);
        boolean checkLastNameExceptInitial = lNameExceptInitial.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("checkLastNameExceptInitial = " + checkLastNameExceptInitial);
        boolean checkCharactersExceptLetters = s.replaceAll("[a-zA-Z ]", "").replaceAll("\\s+", " ").length() > 0;


        if (FirstNameInitialRule == false || LastNameInitialRule == false) {
            System.out.println("\"Error in initials\". Initial must be UpperCase");

        }
        if (checkFirstNameExceptInitial || checkLastNameExceptInitial) {
            System.out.println("Just initials of name must be written Uppercase ");


        }

        if (checkCharactersExceptLetters == true) {
            System.out.println("No accept symbols or number ");
        } else {
            System.out.println("Next 6. step");
        }


    }


    }





