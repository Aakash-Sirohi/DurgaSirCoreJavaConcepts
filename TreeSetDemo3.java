import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        int ans = 0;
        if(i1 < i2) ans =  1;
        if(i1 > i2) ans =  -1;
        if(i1 == i2) ans =  0;
//         return i1.compareTo(i2); // ascending order
//         return -i1.compareTo(i2); // descending order
//         return i2.compareTo(i1); // descending order
//         return -i2.compareTo(i1); // ascending order
//         return 1; // default insertion order
//         return -1; // reverse insertion order
//         return 0; // only 1 element is inserted
        return ans;
    }
}
public class TreeSetDemo3 {
    public static void main(String[] args) {
        MyComparator comparator = new MyComparator();
        TreeSet ts = new TreeSet(comparator);
        ts.add(10);
        ts.add(0);
        ts.add(15);
        ts.add(5);
        ts.add(20);
        ts.add(20);
        System.out.println(ts);
    }
}
