package uniqueelement;

public class Q01 {

    public static void main(String[] args) {
        System.out.println("****** Question 01 ***************");
        //Type code to print unique characters in a String. For example; Hello ==> Heo

//        System.out.println("******** 1.way********");
//        String s = "Hello";
//        for (int i = 0; i < s.length(); i++) {
//            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
//                System.out.print(s.charAt(i));//Hoe
//              //  System.out.print((i));//0 1 4
//            }
//        }

        System.out.println("******** 2.way********");

//        String str = "Hello";
//        for (int i = 0; i < str.length(); i++) {
//            if (str.indexOf(str.substring(i, i + 1)) == str.lastIndexOf(str.substring(i, i + 1))) {
//                System.out.print(str.substring(i, i + 1));//Hoe
//               // System.out.print((i));//0 1 4
//            }
//        }

//        System.out.println("******** 3.way********");
//        int k=0;
//        String st = "Hello";
//        while(k<st.length()){
//            if(st.indexOf(st.charAt(k))==st.lastIndexOf(st.charAt(k))){
//           //     System.out.println(k);
//                System.out.print(st.charAt(k));
//            }
//
//            k++;
//        }

//        System.out.println("******** 4.way********");
//
//        int m=0;
//        String sT = "Hello";
//
//        String box="";
//        do{
//            if(sT.indexOf(sT.charAt(m))==sT.lastIndexOf(sT.charAt(m))){
//                box= box+sT.charAt(m);
//                //   System.out.println(sT.charAt(k));
//
//            }
//            m++;
//        }while(m<sT.length());
//        System.out.println(box);


        System.out.println("******** 5.way********");

        int n=0;
        String sTr = "Hello";
        do{
            if(sTr.indexOf(sTr.charAt(n))==sTr.lastIndexOf(sTr.charAt(n))){

                System.out.print(sTr.charAt(n));//Heo
            }
        //    System.out.print(sTr.charAt(n));//Hello is printed be careful
            n++;
        }while(n<sTr.length());

    }
  }






