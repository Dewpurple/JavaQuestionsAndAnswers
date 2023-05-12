package ifstatement.namerules;

public class Q01 {

    /*
    Type code to check the grammatical rules for full name
    a) Your code should print "Error in initials" for "ali Can", "Ali can", "ali can"
    b) Your code should print "First name or last name missed" for single words like
    "Ali" or "Can" or "ali"
    c) Your code should print "Format error" for all the format like "ALI CAN"
    d) Your code should print "Name was not entered" for one or more space
    characters like " " or " "
    e) Your code should print "Invalid Name" if the name has any character different
    from letters and space.
         */


    public static void main(String[] args) {

    /*

    */

        String s=" ";

        System.out.println("*********************");
        String  sFirsName=s.trim().split(" ")[0];
        String  sLastName=s.trim().split(" ")[1];

//        String sFirsName= s.substring(0, s.indexOf(" "));//Ali
//        String sLastName= s.substring(s.indexOf(" ")+1);//Can


        try {
            System.out.println("sLastName.charAt(0) = " + sLastName.charAt(0));
            System.out.println("sLastName =" + sLastName);

            System.out.println("******1 Error in initials******* ");

            boolean FirstNameInitialRule = (sFirsName.charAt(0) >= 'A' && sFirsName.charAt(0) <= 'Z');
            System.out.println("sLastName " + FirstNameInitialRule);
            boolean LastNameInitialRule = (sLastName.charAt(0) >= 'A' && sLastName.charAt(0) <= 'Z');
            System.out.println("sLastName " + LastNameInitialRule);

            if (FirstNameInitialRule == false || LastNameInitialRule == false) {
                System.out.println("\"Error in initials. Initial must be UpperCase");
            } else {
                System.out.println("Next 2.Step");
            }


        System.out.println("******2.Format error  All Upper Case letters are wrong ******* ");
        String fNameExceptInitial= s.substring(1, s.indexOf(" "));//li
        String lNameExceptInitial= s.substring(s.indexOf(" ")+2);//an
        System.out.println("fNameExceptInitial = " + fNameExceptInitial);
        System.out.println("lNameExceptInitial = " + lNameExceptInitial);
        boolean checkFirstNameExceptInitial= fNameExceptInitial.replaceAll("[^A-Z]","").length()>0;
        System.out.println("checkFirstNameExceptInitial = " + checkFirstNameExceptInitial);
        boolean checkLastNameExceptInitial= lNameExceptInitial.replaceAll("[^A-Z]","").length()>0;
        System.out.println("checkLastNameExceptInitial = " + checkLastNameExceptInitial);

        if(!checkFirstNameExceptInitial==false || !checkLastNameExceptInitial==false){
            System.out.println("U must use lower case except initials of your full name ");
        }else{
            System.out.println("Next 3. step");
        }



        System.out.println("****** try catch before Empty check*****");
        System.out.println("******3. First name or last name missed******* ");
        boolean emptyLastName= sLastName.isEmpty();
        boolean emptyFirstNaame=sFirsName.isEmpty();

        if(emptyFirstNaame==true || emptyLastName==true){
            System.out.println("U must write full name");
        }else{
            System.out.println("Next 3.Step");
        }


        }catch (Exception e){
            System.out.println("If there is a missing part of full name");
        }
        String sFullNameWithOneSpace=s.replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim();
        System.out.println("sFullNameWithOneSpace= " + sFullNameWithOneSpace);


        System.out.println("****** 4. \"Name was not entered\"******* ");
        int sFullNameCheck=s.replaceAll("[^a-zA-Z]","").trim().length();//with space it returns 0
        System.out.println(sFullNameCheck);

        if(sFullNameCheck==0){
            System.out.println("space cannot be accepted as name");
        }else{
            System.out.println("Next step");
        }


        System.out.println("****** 5. \"\"Invalid Name\"\"******* ");

        boolean checkCharactersExceptLetters= s.replaceAll("[a-zA-Z ]", "").length()>0;

        if(checkCharactersExceptLetters==true){
            System.out.println("You must use to write your name only as letters");
        }else{
            System.out.println("Next 6. step");
        }

        //  boolean sFullNameCheckInBoolean=s.replaceAll("[^a-zA-Z ]","").replaceAll("\\s+"," ").trim().length()>0;

    }
}
