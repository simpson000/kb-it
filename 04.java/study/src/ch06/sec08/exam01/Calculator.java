package ch06.sec08.exam01;

public class Calculator {
    void powerOn(){
        System.out.println("Power on");
    }
    int plus(int a, int b){
        return a+b;
    }
    int minus(int a, int b){
        return a-b;
    }
    int multiply(int a, int b){
        return a*b;
    }
    double divide(int a, int b){
        return (double)a/b;

    }
    void powerOff(){
        System.out.println("Power off");
    }

}
