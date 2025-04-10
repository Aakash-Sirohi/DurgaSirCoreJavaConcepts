import java.util.Arrays;
import java.util.List;

public class ArraysasListDemo {
    public static void main(String[] args) {
        String []s = {"A","Z","B"};
        List l = Arrays.asList(s);
        System.out.println(l);
        s[0] = "K";
        System.out.println(l);
        l.set(1,"L");
        for(String a1:s){
            System.out.println(a1);
        }
//        l.add("aakash"); // UnsupportedOperationException
//        l.remove(2); // UnsupportedOperationException
//        l.set(1,new Integer(1)); // ArrayStoreException

    }
}
