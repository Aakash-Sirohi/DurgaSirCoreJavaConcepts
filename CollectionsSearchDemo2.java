import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchDemo2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(15);
        l.add(0);
        l.add(20);
        l.add(10);
        l.add(5);
        System.out.println(l);
        Collections.sort(l, new MyComparator9());
        System.out.println(l);
        System.out.println(Collections.binarySearch(l, 10, new MyComparator9()));
        System.out.println(Collections.binarySearch(l, 13, new MyComparator9()));
        System.out.println(Collections.binarySearch(l, 17));
    }
}

class MyComparator9 implements Comparator {
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        return i2.compareTo(i1);
    }
}
