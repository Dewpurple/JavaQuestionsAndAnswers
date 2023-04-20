package ifstatement;

public class Q07_StateAbbreviationsforUSA {
/*
    Type code to check the format of state abbreviations in the USA
    a) Your code should print "State abbreviations cannot have more than 2 characters" if the
    abbreviation has more than 2 characters
    b) Your code should print "State abbreviations cannot have lowercase characters" if the
    abbreviation has lowercase characters
    c) Your code should print "State abbreviations cannot have numeric characters different from
    letters"
    d) Your code should print "State abbreviations cannot have symbols different from
    letters" if the abbreviation has characters different from letters.
    e) If State abbreviation is correct print the state name on the console. At least it should be print for 10 states.
    Note: If the abbreviation has more than 1 error all related error messages should be printed.
    For example; for "fl3" your code should print, "State abbreviations cannot have more than
    2 characters", "State abbreviations cannot have lowercase characters", and "State abbreviations
    cannot have characters different from letters"
 */
    public static void main(String[] args) {

    String sateAbrv="n@";

//    String sletter=sateAbrv.replaceAll("[A-Za-z]","");
//    System.out.println("sletter = " + sletter);
//
//    String snumRule=sateAbrv.replaceAll("[^0-9]","");
//    System.out.println("numRule = " + snumRule);
//
//    String slowerCaseRule=sateAbrv.replaceAll("[^a-z]","");
//    System.out.println("slowerCaseRule = " + slowerCaseRule);
//
//    String sCheckSymbolsRule=sateAbrv.replaceAll("[A-Za-z0-9]","");
//        System.out.println("sdifFromLettersRule = " + sCheckSymbolsRule);

    boolean lowerCaseRule=sateAbrv.replaceAll("[^a-z]","").length()>0;//lowercase rule
    boolean numRule=   sateAbrv.replaceAll("[^0-9]","").length()>0;//nums rule
    boolean checkSymbolsRule = sateAbrv.replaceAll("[A-Za-z0-9]","").length()>0;//symbols rule
    boolean digitsRule=sateAbrv.length()!=2;//2 digits

     if(digitsRule){
         System.out.println("Must be 2 digits, it cannot be more than 2 characters");
     }if(checkSymbolsRule){
            System.out.println("State abbreviations cannot have symbols instead of characters");
     }if(numRule){
            System.out.println("State abbreviations cannot have numbers instead of characters");
     }if(lowerCaseRule){
            System.out.println("State abbreviations cannot have lowercase characters");
        }else{
            switch (sateAbrv){
                case "FL":
                    System.out.println("Florida");
                    break;
                case "TX":
                    System.out.println("Texas");
                    break;
                case "CA":
                    System.out.println("California");
                    break;
                case "HI":
                    System.out.println("Hawai");
                    break;
                case "AK":
                    System.out.println("Alaska");
                    break;
                case "AZ":
                    System.out.println("Arizona");
                    break;
                case "NC":
                    System.out.println("North Carolina");
                    break;
                case "SC":
                    System.out.println("South Carolina");
                    break;
                case "MI":
                    System.out.println("Michigana");
                    break;
                case "NY":
                    System.out.println("New York");
                    break;
            }
        }


    }
}
