package OCA;

public class Q01 {

    public static void main(String[] args) {
        int x=1;
        int y=1;
        if(x++<++y){//x=1 now ==> next x=2    y =2 now, so 1<2 ==> True
            System.out.println("Hello");//Hello
        }else{
            System.out.println("Welcome");
        }

        System.out.println("Log " + x + ":" + y);// next x = 2, y=2==> Log 2:2
    }
}
