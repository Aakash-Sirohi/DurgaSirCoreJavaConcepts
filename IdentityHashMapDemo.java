import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap map = new IdentityHashMap();
        Integer i = new Integer(10);
        Integer j = new Integer(10);
        map.put(i,"aakash");
        map.put(j,"sirohi");
        System.out.println(map);
    }
}
