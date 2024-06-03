package lang.wrapper;

public class MyIntegerMethodMain1 {

    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);

        System.out.println("result1 = " + myInteger.compareTo(-5));
        System.out.println("result2 = " + myInteger.compareTo(15));
        System.out.println("result3 = " + myInteger.compareTo(10));
    }
}
