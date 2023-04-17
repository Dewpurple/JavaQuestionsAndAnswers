package ifstatement.password;

public class Q01 {
    /*
            Type code to print
            a) "Valid Password" if the password has at least 8 characters different from space
            character
            b) "Do not use space character in password" if the password has any space
            character in any position
            c) "Invalid Password" if a or A and b or B conditions are not satisfied
            Note: Be careful about the orders of conditions in the solution
             */
    public static void main(String[] args) {
        String passsword="a112 67bc";

        boolean passwordNoSpaceRule= passsword.replaceAll("[^\\s]","").length()>0;//if it returns true, my condition will be false
        boolean passwordRuleForLength=passsword.replaceAll("[\\s+]","").length()<8;//if it returns true, my condition will be false
        boolean passwordwithA=passsword.replaceAll("[^aA]","")
                            .replaceAll("[\\s]","").length()>0;//if it returns true, my condition will be true

        boolean passwordandwithB=passsword.replaceAll("[^bB]","")
                .replaceAll("[\\s]","").length()>0;//if it returns true, my condition will be true


        if(passwordNoSpaceRule ||passwordRuleForLength || passwordwithA || passwordandwithB){//even there is only one true, the condition will be run
        //returns True               //returns True          //returns True      //returns True
       //(means false password)     (means false password)    (means true password)  (means true password)

            if (passwordNoSpaceRule) {
               System.out.println("INVALID!!!... No Space character");
           }if (passwordRuleForLength) {
               System.out.println("INVALID!!!... at least 8 characters must be written");
           }if(!passwordwithA || !passwordandwithB){
               System.out.println("INVALID!!!... at least one a and b must exist in your password");
           }

       }else{
            System.out.println("VALID!!! PASSWORD");
        }



    }

    }

