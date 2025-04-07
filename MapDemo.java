import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("A", 1);
        map.put(new StringBuffer("A"), 2);
        System.out.println(map);
    }
}
