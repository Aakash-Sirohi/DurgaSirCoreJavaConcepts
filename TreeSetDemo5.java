import java.util.Comparator;
import java.util.TreeSet;

class MyComparator3 implements Comparator {
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);
    }
}

public class TreeSetDemo5 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator3());
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("K"));
        ts.add(new StringBuffer("L"));
        System.out.println(ts);
    }
}
