package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;
        parent.method1();
        parent.method2();
        ((Child) parent).method3();
        child.method3();
        //부모는 자식의 메서드가 뭐가 있는지 모름
        //자식은 부모의 것을 안다
    }


}
