import Interface.MyTester;
import collections.*;
import exceptions.ExceptionTest;
import javautils.RandomTest;
import javautils.ScannerTest;
import threading.RunnableTest;
import threading.ThreadingTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    //psvm 创建静态执行类
    public static void main(String[] args) {
        HashMap testers =new HashMap<String,MyTester>();
        testers.put(ScannerTest.class.getSimpleName(),new ScannerTest());
        testers.put(RandomTest.class.getSimpleName(),new RandomTest());
        testers.put(ArrayListTest.class.getSimpleName(),new ArrayListTest());
        testers.put(HashSetTest.class.getSimpleName(),new HashSetTest());
        testers.put(LinkedHashSetTest.class.getSimpleName(),new LinkedHashSetTest());
        testers.put(LinkedListTest.class.getSimpleName(),new LinkedListTest());
        testers.put(CollectionsTest.class.getSimpleName(),new CollectionsTest());
        testers.put(ExceptionTest.class.getSimpleName(),new ExceptionTest());
        testers.put(ThreadingTest.class.getSimpleName(),new ThreadingTest());
        testers.put(RunnableTest.class.getSimpleName(),new RunnableTest());

        HashSet<String> testerFetchers = new HashSet<>();
        for (Object key : testers.keySet()) {
            testerFetchers.add(key.toString());
        }
        while (true)
        {
            System.out.println("可测试的类名：");
            for (Object key : testers.keySet()) {
                System.out.println(key);
            }
            System.out.println("输入需要测试的类名");
            String key =  new Scanner(System.in).next();
            Object result  = testerFetchers.stream().filter(c -> c.toLowerCase().startsWith(key.toLowerCase()));
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