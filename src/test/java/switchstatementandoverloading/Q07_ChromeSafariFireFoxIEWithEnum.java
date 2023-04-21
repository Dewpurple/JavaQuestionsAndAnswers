package switchstatementandoverloading;

public class Q07_ChromeSafariFireFoxIEWithEnum {


//    public enum browsername{
//        chrome, safari, ie, firefoc,yandex
//    }

    public static void main(String[] args) {
        getBrowsers("Chrome");
    }

    public static String getBrowsers(String browsername){


        switch (browsername.toLowerCase()){
            case "chrome":
                System.out.println("I'm using CHROME browser");
                break;
            case "safari":
                System.out.println("I'm using SAFARI browser");
                break;
            case "ie":
                System.out.println("I'm using IE browser");
                break;
            case "firefox":
                System.out.println("I'm using firefox browser");
                break;
            case "yandex":
                System.out.println("I'm using YANDEX browser");
                break;
            default:
                System.out.println("What browser is it??? I am confused");
        }

        return browsername;

    }
}
