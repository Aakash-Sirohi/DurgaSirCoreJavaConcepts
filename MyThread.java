import java.util.ArrayList;
import java.util.Iterator;

public class MyThread extends Thread {
    static ArrayList l = new ArrayList();
    public void run() {
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
        }
        System.out.println("Child Thread Updating List");
        l.add("D");
    }
    public static void main(String[] args) throws InterruptedException {
        l.add("A");
        l.add("B");
        l.add("C");
        MyThread t = new MyThread();
        t.start();
        Iterator itr = l.iterator();
        while(itr.hasNext()){
            String s1 = (String) itr.next();
            System.out.println("Main Thread iterating List and current object is: " + s1);
            Thread.sleep(3000);

        }
        System.out.println(l);
    }
}
