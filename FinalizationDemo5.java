public class FinalizationDemo5 {
    static int count = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 10000000; i++) {
            FinalizationDemo5 f=new FinalizationDemo5();
            f= null;
        }

    }
    public void finalize() throws Throwable {
        System.out.println("Finalize method called" + " " + ++count);
    }
}
