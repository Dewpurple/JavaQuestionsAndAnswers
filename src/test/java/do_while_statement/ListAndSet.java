package do_while_statement;

import java.util.*;

public class ListAndSet {


    public static void main(String[] args) {


        getList();

    }



    public static void getList() {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter Strings when you want to stop press 0");

        List<String> list = new ArrayList<>();


        do{
            String s=input.next();

            if(!s.equals("0")) {
                list.add(s);
            }else{
                break;
            }


        }while (true);
        System.out.println(list);

        Set<String> sl1=new HashSet<>(list);
        System.out.println("sl1 = " + sl1);

        input.close();
    }





}

