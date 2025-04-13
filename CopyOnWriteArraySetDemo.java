import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        CopyOnWriteArraySet set = new CopyOnWriteArraySet();
        set.add("D");
        set.add("B");
        set.add("C");
        set.add("A");
        set.add(null);
        set.add(10);
        set.add("D");
        ArrayList<String> list = new ArrayList<String>();
//        list.add(new Integer(1));
    }
}
