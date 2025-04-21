public class HeapDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Max memory: " + (double) (r.maxMemory()/(1024*1024)));
        System.out.println("Total memory: " + (double) r.totalMemory()/(1024*1024));
        System.out.println("Free memory: " + (double) r.freeMemory()/(1024*1024));
        System.out.println("Used memory: " + (double) (r.totalMemory() - r.freeMemory())/(1024*1024));
    }
}
