import javautils.MyTester;
import javautils.RandomTest;
import javautils.ScannerTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        HashMap testers =new HashMap<String,MyTester>();
        testers.put(ScannerTest.class.getSimpleName(),new ScannerTest());
        testers.put(RandomTest.class.getSimpleName(),new RandomTest());
        HashSet<String> testerFetechers =new HashSet<String>();
        for (Object key : testers.keySet()) {
            testerFetechers.add(key.toString());
        }
        while (true)
        {
            System.out.println("可测试的类名：");
            for (Object key : testers.keySet()) {
                System.out.println(key);
            }
            System.out.println("输入需要测试的类名");
            String key =  new Scanner(System.in).next();
            Object result  = testerFetechers.stream().filter(c -> c.toLowerCase().startsWith(key.toLowerCase()));
            Optional<String> target= ((Stream) result).findFirst();
            if (target.equals(Optional.empty()))
                System.out.println("没有匹配的类名，请重新输入");
            else{
                String matchedKey= target.get();
                System.out.println("匹配的类名:"+matchedKey);
                System.out.println("执行=>");
                ((MyTester)testers.get(matchedKey)).test();
            }
            System.out.println("--------------------------");
        }
    }
}