package ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(()-> {
            System.out.println("출근합니다");
            System.out.println("프로그래밍 합니다");
            System.out.println("퇴근!");
        });
    }
}
