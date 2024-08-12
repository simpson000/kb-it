package ch06.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car("그랜저","검정",250);
        //Car car=new Car();
        System.out.println(mycar.model);
        System.out.println(mycar.color);
        System.out.println(mycar.maxspeed);
    }
}
