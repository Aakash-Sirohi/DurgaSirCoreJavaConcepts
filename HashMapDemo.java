import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap m = new HashMap();
        m.put("chiranjeevi", 700);
        m.put("balaiah", 800);
        m.put("venkatesh", 200);
        m.put("nagarjuna", 500);
//        System.out.println(m);
//        System.out.println(m.put("chiranjeevi", 1000));
        Set s = m.keySet();
//        System.out.println(s);
        Collection c = m.values();
//        System.out.println(c);
        Set s1 = m.entrySet();
//        System.out.println(s1);
        Iterator itr = s1.iterator();
        while (itr.hasNext()) {
            Map.Entry m1 = (Map.Entry) itr.next();
//            System.out.println(m1.getKey() + " : " + m1.getValue());
            if(m1.getKey().equals("nagarjuna")) {
                m1.setValue(10000);
            }
        }
//        System.out.println(s1);
//        Hashtable h = new Hashtable();
//        h.put(null, 1);
        StringBuffer sb = new StringBuffer("A");
        StringBuffer sb1 = new StringBuffer("A");
//        System.out.println(sb.equals(sb1));
        HashMap m2 = new HashMap();
        Integer i =  new Integer(10);
        Integer j = new Integer(10);
        m2.put(i,"nagarjuna");
        m2.put(j,"balaiah");
        System.out.println(m2);
    }
}
