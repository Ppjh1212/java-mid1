package lang.string.ex;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int endIndex = str.indexOf(".txt");
        String fileName = str.substring(0, endIndex);
        String extName = str.substring(endIndex);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
