package ifstatement.password;

public class Q02_Ternary_ValidPassword {
    /*
        Use ternary to print "Valid Password" if the password has at least 8 characters different
        from space characters. "Invalid Password" if the password has less than 8 characters
        different from space character
     */
    public static void main(String[] args) {

        String psw = " 1234567";


        String validPassword =
                psw.replaceAll("\\s+", "").trim().length() < 8 ? "InValid Password!!!" : "Valid Password!!! ";
        System.out.println("validPassword = " + validPassword);
    }
}