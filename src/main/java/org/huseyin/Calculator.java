package org.huseyin;

/**
 * Created by huseyin on 14/09/2017.
 */
public class Calculator {

    public int add (int x, int y) {
        return x+y;
    }

    public void print() {
        try {
            System.out.println("Calculator");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
