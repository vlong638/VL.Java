package javautils;

import Interface.MyTester;

import java.util.Random;

public class RandomTest implements MyTester {
    public void test() {
        Random r = new Random(100);
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt());
        }
    }
}
