import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo2 {
    public static void main(String[] args) {
        CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        System.out.println(l1);
        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            String s = (String) itr.next();
            if(s.equals("D")) {
                itr.remove();
            }
        }
        System.out.println(l1);
    }
}
