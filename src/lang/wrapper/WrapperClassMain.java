package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //삭제 예정
        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.1);
        System.out.println("newInteger = " + newInteger.toString());
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        //내부 값 읽기
        System.out.println("intValue = " + integerObj.intValue());
        System.out.println("longValue = " + longObj.longValue());
        System.out.println("doubleValue = " + doubleObj.doubleValue());

        //비교
        System.out.println("== : " + (newInteger == integerObj));
        System.out.println("equals : " + (newInteger.equals(integerObj)));
    }
}
