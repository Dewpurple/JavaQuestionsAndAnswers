package do_while_statement;

import java.util.Scanner;

public class Q01_L_Username_Password {

    /*
                Username is “admin”, Password is “pwd123"
                Ask user to enter username and password
                User should see “Enter your username and password” message
                If user enters correct credentials, he should get “You are in your account!” message
                Otherwise, he should see “Enter your username and password” message 3 times
                After 3 times he should get “Your account is blocked” message
           */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("******* do while is in the task************");

        int counter=0;
        do{
            if(counter==3){
                System.out.println("Your account was blocked");
                break;
            }else{
                System.out.println(counter + " times"+ " ,and you have last " +( 3-counter) + " rights");
            }

            System.out.println("Enter your username ");
            String userName=input.next();

            System.out.println("Enter your password ");
            String password=input.next();


            if(userName.equals("admin") && password.equals("pwd123")){
                System.out.println("Your username and password were accepted");
                break;// when if condition runs True it will break, and we go outside the do while loop
            }else{
                System.out.println("wrong username and password ");//when if parts get wrong,we are in do while loop
                //and we go to else part then go to while(true), and do inside do while again.
            }
            counter++;


        }while(true);//when I inform to Java that which restriction, do while loop is running everytime
    }
}
