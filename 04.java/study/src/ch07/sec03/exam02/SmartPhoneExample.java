package ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        Phone phone=new Phone("samsung","black");
        System.out.println(phone.model);
        System.out.println(phone.color);
        System.out.println();
        SmartPhone smartPhone = new SmartPhone("samsung","black");
        System.out.println(smartPhone.model);
        System.out.println(smartPhone.color);
    }
}
