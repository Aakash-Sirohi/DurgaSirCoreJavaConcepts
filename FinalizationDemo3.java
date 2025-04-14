public class FinalizationDemo3 {
    public static void main(String[] args) {
        FinalizationDemo3 f = new FinalizationDemo3();

        f.finalize();
        System.out.println("End of main");
    }
    public void finalize() {
        System.out.println("Uncaught exception in finalize");
        System.out.println(1/0);
    }
}
