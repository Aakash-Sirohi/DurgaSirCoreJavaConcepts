public class FinalizationDemo2 {
    public static void main(String[] args) {
        FinalizationDemo2 f = new FinalizationDemo2();
        f.finalize();
        f.finalize();
        f=null;
        System.gc();
        System.out.println("End of main");
    }
    public void finalize() {
        System.out.println("Finalize method called");
    }
}
