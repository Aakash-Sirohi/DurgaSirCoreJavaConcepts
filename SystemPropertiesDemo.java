public class SystemPropertiesDemo {
    public static void main(String[] args) {
        String course = System.getProperty("course");
        if(course.equals("scjp")){
            System.out.println("sun certified java programmer");
        }else {
            System.out.println("not sun certified java programmer");
        }
    }
}
