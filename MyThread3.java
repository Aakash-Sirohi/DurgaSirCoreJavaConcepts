import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread3 extends Thread {
    static CopyOnWriteArrayList l1 = new CopyOnWriteArrayList();
    public void run() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e) {}
        System.out.println("Child Thread updating List");
        l1.add("C");
    }

    public static void main(String[] args) throws InterruptedException {
        l1.add("A");
        l1.add("B");
        MyThread3 t = new MyThread3();
        t.start();
        Iterator itr = l1.iterator();
        while (itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println("Main Thread iterating List and Current Object is: " + s);
            Thread.sleep(3000);
        }
        System.out.println(l1);
    }
}
