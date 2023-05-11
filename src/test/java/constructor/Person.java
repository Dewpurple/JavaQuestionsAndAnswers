package constructor;

public class Person {

    String name;
    static String name2;
    int age;
    String job;
    String clubsAreEvents;
    String hobbiesFromDefaultVariable;
    boolean isSuccessfulFromDefaultVariable;

    public Person() {

    }

    public Person(String name, int age, String job) {
        name = "john";
        name2 = "john";
        age = 40;
        this.job = job;
        this.clubsAreEvents = clubsAreEvents;

//        this.name=name;
//        this.age=age;
//        this.job=job;
    }

    public Person(String name, int age, String job, String clubsAreEventsParameter) {
        this.clubsAreEvents = clubsAreEventsParameter;
    }


    public static void main(String[] args) {

        System.out.println("*******man**********");
        Person man = new Person();
        System.out.println((man.name = "John"));
        System.out.println((man.job = "BA"));
        System.out.println((man.age = 30));

        System.out.println("*******woman**********");
        Person woman = new Person();
        System.out.println((man.name = "Jane"));
        System.out.println((man.job = "QA"));
        System.out.println((man.age = 28));

        System.out.println("*******girl1**********");
        Person girl1 = new Person("Emily", 12, "Student");
        System.out.println(girl1.name);

        System.out.println("*******girl2**********");
        Person girl2 = new Person("Lily", 10, "Stu");
        System.out.println(girl2.name);
        System.out.println(girl2.name2);

        System.out.println("*******girl3**********");
        Person girl3 = new Person("Marry", 11, "Student", "soccer");
        System.out.println(girl3.name);
        System.out.println(girl3.name2);
        System.out.println(girl3.clubsAreEvents);

    }
}
