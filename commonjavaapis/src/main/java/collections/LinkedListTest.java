package collections;

import Interface.MyTester;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 *  LinkedList:List集合的链表实现
 *  实现非同步的,多线程
 *  链表结构,查询慢,增删快
 */
public class LinkedListTest implements MyTester {

    @Override
    public void test() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student(27));
        students.add(new Student(38));
        students.add(new Student(49));
        students.add(new Student(52));
        Collections.sort(students, Comparator.comparingInt(o -> o.Age));
        for (Student s : students) {
            System.out.println(s.Age);
        }
    }
}
