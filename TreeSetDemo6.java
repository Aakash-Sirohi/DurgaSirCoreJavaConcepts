import java.util.Comparator;
import java.util.TreeSet;

class MyComparator4 implements Comparator{
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int ans = 0;
        if(s1.length() < s2.length()){
            ans = -1;
        }else if(s1.length() > s2.length()){
            ans = 1;
        }else {
            ans = s1.compareTo(s2);
        }
        return ans;
    }
}

public class TreeSetDemo6 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet(new MyComparator4());
        ts.add("A");
        ts.add(new StringBuffer("ABC"));
        ts.add(new StringBuffer("AA"));
        ts.add("XX");
        ts.add(new StringBuffer("ABCD"));
        ts.add("A");
        System.out.println(ts);
    }
}
