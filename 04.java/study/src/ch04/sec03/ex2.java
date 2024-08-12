package ch04.sec03;

public class ex2 {
    public static void main(String[] args) {
        char grade='a';

        System.out.println("name: "+grade);

        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("prmium");
                break;
            case 'B':
                case 'b':
                System.out.println("normal");
                break;
            default:
                System.out.println("undefined");
        }
    }
}
