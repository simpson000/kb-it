package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        Korean korean1 = new Korean("대한민국","박자바","011225-1234567");
        Korean korean2 = new Korean("대한민국","김자바","930525-0654321");
        System.out.println(korean1.nation);
        System.out.println(korean1.name);
        System.out.println(korean1.ssn);
        System.out.println(korean2.nation);
        System.out.println(korean2.name);
        System.out.println(korean2.ssn);
    }
}
