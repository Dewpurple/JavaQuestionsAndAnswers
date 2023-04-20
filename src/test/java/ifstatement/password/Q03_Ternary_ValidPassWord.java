package ifstatement.password;

/*
    Type code to check the password
    If it has more than 8 characters, initial should be 'i'
    If it does not have more than 8 characters initial should be 'K'
    Solve the task by using nested-ternary
 */
public class Q03_Ternary_ValidPassWord {
    public static void main(String[] args) {
        getPassword("K1234568");
    }

    public static String getPassword(String pswd){

        String passwordRule= pswd.length()>=8  ?
                pswd.startsWith("i") ? "Your password started with <i>,so this is correct "      : "Your password have to start with <i>,so this is incorrect"
                : pswd.startsWith("K")  ? "Your password started with <K>,so this is correct"      : "Your password have to start with <K>,so this is incorrect" ;

        System.out.println("passwordRule = " + passwordRule);
        return null;
    }
}
