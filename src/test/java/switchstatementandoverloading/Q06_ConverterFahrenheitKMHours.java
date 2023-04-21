package switchstatementandoverloading;

public class Q06_ConverterFahrenheitKMHours {

    static String str="7200";

    public static void main(String[] args) {

        getConvert("secondsToHour");

    }


    public static String getConvert(String convert){

            switch (convert) {
                case "mileToKM":
                    Double mileKM = Double.parseDouble(str);
                    double mileKM_double=mileKM * 1.60934;
                    int mileKM_int=(int)mileKM_double;
                    System.out.println(+mileKM_int + " KM");
                    break;
                case "secondsToHour":
                    double secondsHour = Double.parseDouble(str);
                    double secondHour_double=secondsHour*0.000277778;
                    int secondHour_int=(int)secondHour_double;
                    System.out.println(+secondHour_int  + " Hours");
                    break;
                case "fahrenheitToCelsius":
                    double fahrenheitCelsius = Double.parseDouble(str);
                    double fahrenheitCelsius_double=(fahrenheitCelsius-32)*5/9;
                    System.out.println(+fahrenheitCelsius_double + " Celsius");
                    break;
                default:

            }

            return convert;
        }

    }










