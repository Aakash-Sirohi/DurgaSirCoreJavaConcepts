import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread2 extends Thread {
    static ConcurrentHashMap m = new ConcurrentHashMap();
//    static HashMap m = new HashMap();
    public void run() {
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){}
        System.out.println("Child Thread Updating Map");
        m.put(103,"C");
    }

    public static void main(String[] args) throws InterruptedException {
        m.put(101,"A");
        m.put(102,"B");
        MyThread2 t = new MyThread2();
        t.start();
        Set s = m.keySet();
        Iterator i = s.iterator();
        while(i.hasNext()){
            Integer key = (Integer)i.next();
            System.out.println("Main Thread iterating and Current Entry is:"
            + key + "......" + m.get(key));
            Thread.sleep(3000);
        }
        System.out.println(m);
    }
}
