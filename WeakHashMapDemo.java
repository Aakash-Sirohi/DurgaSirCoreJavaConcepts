import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws Exception {
        WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t,"aakash");
        System.out.println(m);
        t = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);
    }
}

class Temp {
    @Override
    public String toString() {
        return "Temp";
    }
    public void finalize(){
        System.out.println("finalize method called");
    }
}