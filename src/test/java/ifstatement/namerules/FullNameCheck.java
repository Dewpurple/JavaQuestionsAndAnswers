package ifstatement.namerules;

public class FullNameCheck {

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

        public static void main (String[]args){


            String s = "Ali";
            useSpaceEmptyAndLessThan2Characters(s);
            initialsCheck(s);
            useNumbersOrSymbols(s);
            skipLastName(s);
        }

        public static void useNumbersOrSymbols (String s){

            String sFullNameCheck = s.replaceAll("[A-Za-z]", "").trim();//
            int symbolsAndNumberLength = sFullNameCheck.length();

            if (symbolsAndNumberLength > 0) {
                System.out.println("symbols or numbers are not accepted ");
            }

        }


        public static void useSpaceEmptyAndLessThan2Characters (String s){
            if (s.isEmpty() || s.isBlank()) {
                System.out.println("You cannot skip to write first and last name");
            }

            try {
                String sFirstName = s.trim().split(" ")[0].replaceAll("[^A-Za-z]", "");
                int sFirstNameLength = sFirstName.length();

                String sLastName = s.trim().split(" ")[1].replaceAll("[^A-Za-z]", "");
                int sLastNameLength = sLastName.length();

                if ((sFirstNameLength < 2)) {
                    System.out.println("First Name must be At least 2 characters");
                }

                if ((sLastNameLength < 2)) {
                    System.out.println("Last Name must be At least 2 characters");

                }
            } catch (Exception e) {

            }

        }


        public static void initialsCheck (String s){

            try {
                String sFirstName = s.split(" ")[0].trim();
                String sLastName = s.split(" ")[1].trim();
                ;
                boolean FirstNameInitialRule = (sFirstName.charAt(0) >= 'A' && sFirstName.charAt(0) <= 'Z');
                boolean LastNameInitialRule = (sLastName.charAt(0) >= 'A' && sLastName.charAt(0) <= 'Z');

                if (FirstNameInitialRule == false || LastNameInitialRule == false) {
                    System.out.println("\"Error in initials\". Initial must be UpperCase");
                }

                String fNameExceptInitial = s.substring(1, s.indexOf(" "));//li
                String lNameExceptInitial = s.substring(s.indexOf(" ") + 2);//an
                boolean checkFirstNameExceptInitial = fNameExceptInitial.replaceAll("[^A-Z]", "").length() > 0;
                boolean checkLastNameExceptInitial = lNameExceptInitial.replaceAll("[^A-Z]", "").length() > 0;

                if (checkFirstNameExceptInitial || checkLastNameExceptInitial) {
                    System.out.println("Just initials of first and last name must be written Uppercase ");

                }

            } catch (Exception e) {

            }

        }


        public static void skipLastName (String s){


            try {
                int sLastName = s.trim().split(" ")[1].replaceAll("[^A-Za-z]", "").length();
            } catch (Exception e) {
                int sFullNameLength = s.replaceAll("[A-Za-z]", "").trim().length();
                if (!(sFullNameLength > 0) && !(s.isEmpty()) && !(s.isBlank()) && (s.charAt(0) >= 'a') && (s.charAt(0) <= 'z')) {
                    System.out.println("*****don't skip last name and initials must be uppercase for first name*****");
                } else if (!(sFullNameLength > 0) && !(s.isEmpty()) && !(s.isBlank()))
                    System.out.println("\"*****don't skip last name ***** ");
            }
        }

    }









