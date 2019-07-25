package collections;

import Interface.MyTester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *  ArrayList:大小可变的数组结构
 *  实现非同步的,多线程
 *  数组结构,查询快
 */
public class ArrayListTest implements MyTester {

    @Override
    public void test() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(17));
        students.add(new Student(18));
        students.add(new Student(19));
        students.add(new Student(32));
        Collections.sort(students, Comparator.comparingInt(o -> o.Age));
        for (Student s : students) {
            System.out.println(s.Age);
        }
    }
}
