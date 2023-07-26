public class Main {
    public static void main(String[] args) {

        Message m1 = new Message(1, "Hello from Android!");
        m1.display();

        Message m2 = new Message(2, "Welcome to Java!");
        m2.display();

        Emp e1 = new Emp(101, "AA", 12, 12, 2022);
        e1.display();
        System.out.println();

        Date d = e1.getDob();
        d.setDay(11);
        d.setMonth(11);
        d.setYear(2020);

        e1.display();



    }
}
