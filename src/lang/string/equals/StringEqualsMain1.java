package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        //new String() == 비교
        System.out.println((str1 == str2));

        //new String() equals 비교;
        System.out.println(str1.equals(str2));

        String str3 = "hello";
        String str4 = "hello";

        //리터럴 == 비교
        System.out.println((str3 == str4));

        //리터러럴 equals 비교
        System.out.println((str3.equals(str4)));

    }
}
