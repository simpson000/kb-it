package ch06.sec08.exam03;

public class Car {
    int gas;

    String model;
    boolean enough(){
        if (gas>0){
            System.out.println(" 가스 있음");
            return true;
        }
        else {
            System.out.println("가스 음삼");
            return false;
        }
    }
    void run(){
        System.out.println("출발합니다");
        while(true){
            if (gas>0){
                System.out.println("달립니다(gas 잔량: " +gas+")");
                gas-=1;
            }
            else {
                System.out.println("멈춥니다");
                return;
            }
        }
    }
    public int getGas() {
        gas+=1;
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

}
