import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put(new Temp1(5), "A");
        ht.put(new Temp1(2), "B");
        ht.put(new Temp1(6), "C");
        ht.put(new Temp1(15), "D");
        ht.put(new Temp1(23), "E");
        ht.put(new Temp1(16), "F");
//        ht.put(new Temp1(25), null); // NullPointerException
        System.out.println(ht);
    }
}
class Temp1 {
    int i;
    Temp1(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }
    public String toString() {
        return i + "";
    }
}