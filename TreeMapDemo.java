import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(100,"ZZZ");
        tm.put(102,"YYY");
        tm.put(103,"XXX");
        tm.put(104,106);
        // tm.put("FFFF","XXX"); // ClassCastException
        // tm.put(null , "FFF"); // NullPointerException
        System.out.println(tm);
    }
}
