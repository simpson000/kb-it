package ch04.sec04;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int vel=0;
        boolean run = true;

        while (run){
            System.out.println("-----------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-----------------------------");
            System.out.print("선택: ");
            String strNum = scanner.nextLine();
            if (strNum.equals("1")){
                System.out.println("선택 :"+strNum);
                vel+=1;
                System.out.println("현재 속도 = " + vel);

            }
            else if (strNum.equals("2")){
                System.out.println("선택 :"+strNum);
                vel-=1;
                System.out.println("현재 속도 = " + vel);
            }
            else if (strNum.equals("3")){
                System.out.println("선택 :"+strNum);
                run=false;
            }
        }
    }
}
