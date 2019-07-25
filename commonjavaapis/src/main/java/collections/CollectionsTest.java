package collections;

import Interface.MyTester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsTest implements MyTester {
    public void test() {
        ArrayList<Integer> values = new ArrayList<>();
        values.add(65);
        values.add(1);
        values.add(33);
        values.add(22);
        Collections.sort(values, Comparator.comparingInt(o -> o));
        for (Integer v : values) {
            System.out.println(v);
        }
    }
}
