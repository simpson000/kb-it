package ch04.sec06;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요");
        System.out.println("프로그램을 종료하려면 q를 입력하세요");
        Scanner sc = new Scanner(System.in);
        String str;
        do{
            System.out.print(">");
            str = sc.nextLine();
            System.out.println(str);
        }while(!str.equals("q"));
        System.out.println();
        System.out.println("프로그램 종료");
    }
}
