import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysSearchDemo {
    public static void main(String[] args) {
        int a[] = {10,5,20,11,6};
        Arrays.sort(a);
        System.out.println(Arrays.binarySearch(a,6));
        System.out.println(Arrays.binarySearch(a,14));

        String s[] = {"A","Z","B"};
        Arrays.sort(s);
        System.out.println(Arrays.binarySearch(s,"Z"));
        System.out.println(Arrays.binarySearch(s,"S"));
        List l = Arrays.asList(s);
//        l.remove(1);
        l.set(1,new Integer(1));
        Arrays.sort(s,new MyComparator11());
        System.out.println(Arrays.binarySearch(s,"Z", new MyComparator11()));
        System.out.println(Arrays.binarySearch(s,"S", new MyComparator11()));
        System.out.println(Arrays.binarySearch(s,"N"));

    }
}

class MyComparator11 implements Comparator {
    public int compare(Object o1, Object o2) {
        return o2.toString().compareTo(o1.toString());
    }
}