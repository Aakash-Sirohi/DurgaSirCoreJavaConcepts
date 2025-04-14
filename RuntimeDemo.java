import java.util.Date;

public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
        for (int i = 0; i < 20000; i++) {
            Date d = new Date();
            d = null;
        }
        System.out.println(runtime.freeMemory());
        runtime.gc();
        System.out.println(runtime.freeMemory());
    }
}
