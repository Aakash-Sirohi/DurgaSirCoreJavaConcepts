public class FinalizationDemo {
    public static void main(String[] args) {
        FinalizationDemo s = new FinalizationDemo();
        s = null;
        System.gc();
        System.out.println("End of main");
    }
    public void finalize() {
        System.out.println("finalize method called");
    }
}
