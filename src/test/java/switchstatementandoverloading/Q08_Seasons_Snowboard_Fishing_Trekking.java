package switchstatementandoverloading;

public class Q08_Seasons_Snowboard_Fishing_Trekking {
    /*
    For winter print 'Snowboarding'
    For summer and spring print 'Fishing'
    For fall print 'Trekking'
     */
    public static void main(String[] args) {
        getActivity("SPRING");
    }


    public static String getActivity(String season){
        switch (season.toLowerCase()){
            case "winter":
                System.out.println("Snowboarding");
                break;
            case "summer":
            case "spring":
                System.out.println("Fishing");
                break;
            case "fall":
                System.out.println("Trekking");
                break;
            default:
                System.out.println("It couldn't be recognised as a season name");
                break;
        }
        return season;
    }



}
