package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        try {
            for(int i=0; i<=array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException:"+e.getMessage());
        }catch (NumberFormatException e) {
            System.out.println("NumberFormatException:" + e.getMessage());
        }catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }

    }

}
