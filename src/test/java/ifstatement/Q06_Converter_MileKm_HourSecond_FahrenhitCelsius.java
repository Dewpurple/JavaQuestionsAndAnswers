package ifstatement;

public class Q06_Converter_MileKm_HourSecond_FahrenhitCelsius {
   /*
   Type code to create a converter which converts mile to km, second to hour, fahrenheit to
    celsius. Find the formulas for conversions from Google.
    a) When user entered 10 and mileToKm String, your code should print "16 km"(The
    number will be dynamic) on the console
    b) When user entered 7200 and secondsToHours String, your code should print "2
    Hours"(The number will be dynamic) on the console
    c) When user entered 83 and fahrenheitToCelsius String, your code should print
    "28.3333 celsius"(The number will be dynamic) on the console
    */
   public static void main(String[] args) {

      int mile=10;
      int mileToKm=(int)(mile*1.60934);
    //  System.out.println("mileToKm = " + (mileToKm+1));//when the result returns integer, math operation will returns result of add operation

      String sMileToKm =String.valueOf(mileToKm);
    //  System.out.println("sMileToKm = " + (sMileToKm+1) ); //when the result returns String, math operation will won"t gives result of add operation
    //  System.out.println("Dynamic result as String Mile to KM : " +sMileToKm +" KM");

      int minutes=17200;
      int minutesToHours=(int)((minutes*0.0166667)/60);

      String sminutesToHours =String.valueOf(minutesToHours);
   //   System.out.println("Dynamic result as String for minutes Hours :" +sminutesToHours + " Hours");

      double fahrenheit=100;
      double fahrenheitToCelsius=(fahrenheit-32)*5/9;
      String sfahrenheitToCelsius=String. valueOf(fahrenheitToCelsius);
    //  System.out.println("Dynamic result as String  fahrenheit To Celsius = " + sfahrenheitToCelsius + " celsius");

      String operator="fahrenheitToCelsius";
      if(operator.equals("mileToKm") ){
         System.out.println("Dynamic result as String Mile to KM from if: " +sMileToKm +" KM");
      }else if(operator.equals("minutesToHours")){
         System.out.println("Dynamic result as String for minutes Hours form else if :" +sminutesToHours + " Hours");
      }else if(operator.equals("fahrenheitToCelsius")){
         System.out.println("Dynamic result as String  fahrenheit To Celsius from else if = " + sfahrenheitToCelsius + " celsius");
      }else{
         System.out.println(" Invalid request!!! write \n mileToKm or \n minutesToHours or \n fahrenheitToCelsius");
      }
   }
   }