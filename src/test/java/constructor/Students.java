package constructor;

public class Students {

    String name;
    String familyPhone;
    String registerNo;
    int age;
    boolean isEvents;
    String club;
    boolean isTransferBus;
    static String library;

    Students(){
    }

    Students
            (String nameP,String familyPhoneP,String registerNoP,int ageP,boolean isEventsP,String clubP,boolean isTransferBus) {

        this.familyPhone=familyPhoneP;
        this.name=nameP;
        this.age=ageP;
        this.registerNo=registerNoP;
        this.club=clubP;

    }

    Students
            (String nameP,String familyPhoneP,String registerNoP,int ageP){


    }

    Students
            (String nameP,String familyPhoneP,String registerNoP,int ageP,boolean isTransferBusP){


    }


    Students
            (String nameP,String familyPhoneP,String registerNoP,int ageP,boolean isTransferBusP,String libraryP){

        this.familyPhone=familyPhoneP;
        this.name=nameP;
        this.age=ageP;
        this.registerNo=registerNoP;


    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", familyPhone='" + familyPhone + '\'' +
                ", registerNo='" + registerNo + '\'' +
                ", age=" + age +
                ", isEvents=" + isEvents +
                ", club='" + club + '\'' +
                ", isTransferBus=" + isTransferBus +
                ", library='" + library + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("******* 1.way  ********");
        Students students1=new Students();
        System.out.println(students1.name = "Micheal");
        System.out.println(students1.age = 12);
        System.out.println(students1.registerNo = "100");
        System.out.println(students1.familyPhone = "123888-1199");

        System.out.println("******* 2.way  2.student for all parameters********");
        Students students2=new Students
                ("Liz","102999-1234","101",10,true,"chest",false);
        System.out.println(students2.club);
        System.out.println(students2.name);
        System.out.println(students2.registerNo);
        System.out.println(students2.age);
        System.out.println(students2.familyPhone);
        System.out.println(students2.isEvents);

        System.out.println("******* 2.way  4.student for all parameters********");
        Students students4=new Students
                ("Kate","102999-1122","103",10,true,"chest",false);
        System.out.println(students4);

        System.out.println();


        System.out.println("******* 2.way 3.student some of parameters********");
        Students students3=new Students
                ("Nora","102999-1567","102",10,true,"passive");
        System.out.println(students3);


    }

}
