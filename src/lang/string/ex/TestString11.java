package lang.string.ex;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        String reverseString = new StringBuilder(str).reverse().toString();
        System.out.println("reverseString = " + reverseString);
    }
}
