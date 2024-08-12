package ch06.sec08.exam02;

public class Computer {
    int sum(int ... values) {
        int sum = 0;
        //현재 들어있는 모든 수를 할당 할 때 까지 반복
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

}
