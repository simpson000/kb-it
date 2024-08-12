package ch16.sec03;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.action1((name,job)->{
            System.out.println(name + "이");
            System.out.println(job + "합니다");
        } );
        person.action2(content->{
            System.out.println(content + "말합니다");
            System.out.println(content + "외칩니다");
        } );
    }
}
