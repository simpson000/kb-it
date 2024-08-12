package ch13.sec02;

public class Product <K,M>{
    private K key;
    private M value;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public M getValue() {
        return value;
    }

    public void setValue(M value) {
        this.value = value;
    }
}
