package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {
    Car car = new Car();
    car.setSpeed(-50);
    System.out.println("현재속도 :"+ car.getSpeed());
    car.setSpeed(60);
    System.out.println("현재속도 :"+ car.getSpeed());
    car.setStop(true);
    System.out.println("현재속도 :"+ car.getSpeed());



    }
}
