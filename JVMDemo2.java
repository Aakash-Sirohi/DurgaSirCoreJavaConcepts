public class JVMDemo2 {
    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(JVMDemo2.class.getClassLoader());
        System.out.println(JVMDemo3.class.getClassLoader());
    }
}
