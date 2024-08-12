package ch04.sec06;

public class ex2 {
    public static void main(String[] args) {
        int ran;
        do{
            ran=(int)(Math.random()*6)+1;
            System.out.println(ran);
        }while ( ran!=6);
    }
}
