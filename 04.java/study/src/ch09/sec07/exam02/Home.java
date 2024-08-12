package ch09.sec07.exam02;

public class Home {
    //필드에 익명 구현 객체 대입
    private RemoteControl rc = new RemoteControl(){
        @Override
        public void turnOn() {
            System.out.println("Home turned on");
        }

        @Override
        public void turnOff() {
            System.out.println("Home turned off");
        }
    };
    private RemoteControl rc2 = new RemoteControl(){
        @Override
        public void turnOn() {
            System.out.println("Home turned audio on");
        }

        @Override
        public void turnOff() {
            System.out.println("Home turned audio off");
        }
    };
    //메소드(필드 이용)
    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }
    public void use2() {
        rc2.turnOn();
        rc2.turnOff();
    }
}
