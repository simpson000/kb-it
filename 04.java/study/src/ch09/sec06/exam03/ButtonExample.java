package ch09.sec06.exam03;

import java.awt.event.ActionListener;

public class ButtonExample {
    public static void main(String[] args) {
        Button b = new Button();
        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Ok");
            }
        }
    }
}
