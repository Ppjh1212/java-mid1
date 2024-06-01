package lang.string.ex;

public class TestString11 {
    public static void main(String[] args) {
        String str = "Hello Java";

        StringBuilder reverseString = new StringBuilder(str).reverse();
        System.out.println("reverseString = " + reverseString);
    }
}
