package ch06.sec09;

public class Car {
    String model;
    int speed;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    void run() {
        System.out.println(model+"Car is running...(시속 "+speed+" km/h)");

    }
}
