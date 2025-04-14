public class FinalizationDemo4 {
    static FinalizationDemo4 s;
    public static void main(String[] args) throws Throwable {
        FinalizationDemo4 f = new FinalizationDemo4();
        System.out.println(f.hashCode());
        f = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(s.hashCode());
        s=null;
        System.gc();
        Thread.sleep(10000);
        System.out.println("End of main");
    }

    public void finalize() throws Throwable {
        System.out.println("Finalize method called");
        s=this;
    }
}
