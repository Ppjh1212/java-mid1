package lang.wrapper;

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {
        int value = 10;

        System.out.println("result1 = " + compareTo(value, 20));
        System.out.println("result2 = " + compareTo(value, 0));
        System.out.println("result3 = " + compareTo(value, 10));
    }

    public static int compareTo(int value, int target) {
        int i = 1;

        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
