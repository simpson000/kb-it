package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    //data 값이 없기때문에 null로 인식했고 이것으로 인해 Cannot invoke "String.length()" because "data" is null 나옴
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");

    }
}
