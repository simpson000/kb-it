package Framework;

import java.util.Scanner;

public class App {
    boolean run =true;
    int StudentNum=0;
    int []score= null;
    Scanner sc = new Scanner(System.in);


    public void printMenu(){
        System.out.println("--------------------------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("--------------------------------------------------------------");

    }

    public int getSelect(){
        System.out.print("선택> ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public void getStudent(){
        System.out.print("학생수> ");
        StudentNum = Integer.parseInt(sc.nextLine());
        score = new int[StudentNum];
    }
    public void getScore(){
        for (int i = 0; i < StudentNum; i++){
            System.out.print((i+1)+ " student : ");
            score[i] = Integer.parseInt(sc.nextLine());
        }
    }
    public void printScore(){
        for(int i=0; i<StudentNum; i++) {
            System.out.println("scores[" + i + "]: " + score[i]);
        }
    }
    public void analize(){
        int max = 0;
        int sum = 0;
        double avg = 0;
        for(int i=0; i <score.length; i++) {
            max = (max<score[i])? score[i] : max;
            sum += score[i];
        }
        avg = (double) sum / StudentNum;
        System.out.println("최고 점수: " + max);
        System.out.println("평균 점수: " + avg);
    }
    public void exit(){
        run = false;
    }
    public void run(){
        while(run) {
            printMenu();
            int choice = getSelect();
            if (choice == 1) {
                getStudent();
            } else if (choice == 2) {
                getScore();
            } else if (choice == 3) {
                printScore();
            } else if (choice == 4) {
                analize();
            } else if (choice == 5) {
                exit();
            }
        }

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();


    }
}
