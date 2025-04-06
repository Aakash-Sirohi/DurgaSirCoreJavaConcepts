import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add("A");
        ts.add("a");
        ts.add("B");
        ts.add("L");
        ts.add("Z");
//        ts.add(new Integer(10)); // In this case we will get  ClassCastException as this is addition of Heterogeneous Object
//        ts.add(null);            // In this case we will get NullPointerException
        System.out.println(ts);
    }
}
