package javautils;

import java.util.Scanner;

public class ScannerTest {
    public void test() {
        //基础输入测试
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数值");
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);
        //非数字输入则引发如下异常
        //Exception in thread "main" java.util.InputMismatchException
        System.out.println("输入任意字符");
        String str = sc.next();
        System.out.println("输入的字符是：" + str);
    }
}
