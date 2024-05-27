package lang.immutable.change.ex;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        //date=x1, date2=x1
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        //date1=x2, date2=x1
        date1 = date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
