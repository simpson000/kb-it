package ch13.sec02;

public class GenericExample {
    public static void main(String[] args) {
        Product <Tv,String> product1= new Product<>();

        product1.setKey(new Tv());
        product1.setValue("스마트 tv");

        Tv tv =product1.getKey();
        String tvmodel = product1.getValue();

        Product <Car,String> product2= new Product<>();
        product2.setKey(new Car());
        product2.setValue("suv");

        Car car = product2.getKey();
        String carmodel = product2.getValue();

    }
}
