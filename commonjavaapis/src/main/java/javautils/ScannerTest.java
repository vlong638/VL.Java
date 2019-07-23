package javautils;

import java.util.Scanner;

public class ScannerTest {
    public void test() {
/*        //基础输入测试
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个数值");
        int num = sc.nextInt();
        System.out.println("输入的数字是：" + num);
        //非数字输入则引发如下异常
        //Exception in thread "main" java.util.InputMismatchException
        System.out.println("输入任意字符");
        String str = sc.next();
        System.out.println("输入的字符是：" + str);*/

        //Scanner的适用场景演示
        System.out.println("适用场景演示");
        String input = "1 fish 23 fish 4 red fish blue fish";
        System.out.println("字符串："+input );
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println("扫描一个数值");
        System.out.println(s.nextInt());
        System.out.println("扫描一个数值");
        System.out.println(s.nextInt());
        System.out.println("扫描一个字符串");
        System.out.println(s.next());
        System.out.println("扫描一个字符串");
        System.out.println(s.next());
        s.close();

    }
}
