public class AssertionDemo {
    public static void main(String...y) {
        boolean assertOn = true;
        assert(assertOn):assertOn = false;
        if(assertOn) {
            System.out.println("assertOn");
        }
    }
}
