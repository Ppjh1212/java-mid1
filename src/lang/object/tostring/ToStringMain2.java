package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍1", 2);
        Dog dog2 = new Dog("멍멍2", 5);

        //단순 toString 호출
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        //println 내부에서 toString 호출
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        //Object 다형성 활용
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        //dog1 참조값
        String dog1RefValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(dog1RefValue);
    }
}
