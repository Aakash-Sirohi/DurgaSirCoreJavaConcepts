import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap(new MyComparator6());
        tm.put("XXX",10);
        tm.put("AAA",20);
        tm.put("ZZZ",30);
        tm.put("LLL",40);
        System.out.println(tm);
    }
}
class MyComparator6 implements Comparator {
    public int compare(Object o1,  Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s2.compareTo(s1);
    }
}