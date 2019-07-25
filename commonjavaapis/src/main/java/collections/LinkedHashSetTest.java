package collections;

import Interface.MyTester;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Set接口:
 * 不允许存储重复的元素
 * 没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 * LinkedHashSet:
 * 不允许存储重复的元素
 * 没有索引,没有带索引的方法,也不能使用普通的for循环遍历
 * 是一个无序的集合
 * 底层是一个哈希表（数组+链表/红黑树）+链表
 * 通过链表从而保证元素有序
 */
public class LinkedHashSetTest implements MyTester {

    @Override
    public void test() {
        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        set.add(12);
        set.add(33);
        set.add(24);
        set.add(51);
        System.out.println("LinkedHashSet 长度："+set.size());
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
