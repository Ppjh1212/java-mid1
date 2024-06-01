package lang.string.ex;

public class TestString6_2 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa"; //6,18,32
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);

        while (index >= 0) {
            index = str.indexOf(key, ++index);
            count++;
        }

        System.out.println("count = " + count);
    }
}