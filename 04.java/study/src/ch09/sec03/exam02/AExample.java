package ch09.sec03.exam02;

public class AExample {
    public static void main(String[] args) {
        A.B a = new A.B();
        System.out.println(a.field1);
        a.method1();
        System.out.println(A.B.field2);
        a.method2();
    }
}
