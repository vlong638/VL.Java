package collections;

import Interface.MyTester;

import java.util.*;

/**
 * Set接口:
 * 不允许存储重复的元素
 * 没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 * HashSet:
 * 不允许存储重复的元素
 * 没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 * 是一个无需的集合
 * 底层是一个哈希表结构,查询速度O(1)
 */
public class HashSetTest implements MyTester {

    @Override
    public void test() {
        HashSet<Integer> set= new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        System.out.println("set长度："+set.size());
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
