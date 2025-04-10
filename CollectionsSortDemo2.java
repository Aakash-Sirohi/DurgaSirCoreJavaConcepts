import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo2 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("Z");
        l.add("A");
        l.add("K");
        l.add("L");
        System.out.println("Before sorting: " + l);
        Collections.sort(l, new MyComparator8());
        System.out.println("After sorting: " + l);
    }
}

class MyComparator8 implements Comparator {
    public int compare(Object o1, Object o2) {
        return o2.toString().compareTo(o1.toString());
    }
}