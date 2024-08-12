package ch04.sec04;

public class ex3 {
    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            System.out.println("***" +x+ "단***");
            for (int y = 1; y < 10; y++) {
                System.out.println(x +"x" +y +"=" +(x*y));
            }
        }
    }
}
