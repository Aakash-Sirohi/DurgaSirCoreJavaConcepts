import java.util.Comparator;
import java.util.TreeSet;
class MyComparator2 implements Comparator {
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = (String)o2;
        return -s1.compareTo(s2);
    }
}
public class TreeSetDemo4 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator2());
        ts.add("Roja");
        ts.add("Shobha Rani");
        ts.add("Raja Kumari");
        ts.add("Ganga Bhavani");
        ts.add("Ramulamma");
        System.out.println(ts);
    }
}
