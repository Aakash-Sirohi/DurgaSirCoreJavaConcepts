import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
//        ts.add(new StringBuffer("A"));
//        ts.add(new StringBuffer("L"));
//        ts.add(new StringBuffer("Z"));
//        ts.add(new StringBuffer("B"));
        System.out.println(ts);
        // Line 10 will give ClassCastException because the objects that are inserted into TreeSet should implement
        // Cloneable interface and Objects should be Heterogeneous
        System.out.println(null instanceof String);
    }
}
