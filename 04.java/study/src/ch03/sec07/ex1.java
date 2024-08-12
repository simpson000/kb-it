package ch03.sec07;

public class ex1 {
    public static void main(String[] args) {
        int charCode ='A';
        //int charCode ='a'
        //int charCode = '5'

        if (charCode >=65 && charCode <=90) {
            System.out.println(" 대문자");
        }
        if (charCode >=97 && charCode <=122) {
            System.out.println(" 소문자");
        }
        if (charCode >=48 && charCode <=57) {
            System.out.println(" 숫자");
        }
        int value = 6;
//int value = 7;
        if( (value%2==0) | (value%3==0) ) {
            System.out.println("2 또는 3의 배수이군요.");
        }
        boolean result = (value%2==0) || (value%3==0);
        if( !result ) {
            System.out.println("2 또는 3의 배수가 아니군요.");
        }


    }
}
