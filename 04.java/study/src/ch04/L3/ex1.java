package ch04.L3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        boolean run =true;
        Scanner sc = new Scanner(System.in);
        int option;
        int total=0;
        int count;
        while(run) {
            System.out.println("-----------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료" );
            System.out.println("-----------------------------");
            System.out.print("선택: ");
            option= sc.nextInt();
            if (option ==4 ) {
                run = false;

            }
            else if (option ==1){
                System.out.print("예금액>");
                count=sc.nextInt();
                total+=count;
            }
            else if (option ==2){
                System.out.print("출금액>");
                count=sc.nextInt();
                total-=count;
            }else if (option ==3){
                System.out.println("잔고>"+total);
            }
            System.out.println();

        }
        System.out.println("프로그램 종료");
    }
}
