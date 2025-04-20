import java.lang.reflect.Method;

class Student {
    public String getName(){
        return null;
    }
    public int getMarks(){
        return 10;
    }

}
public class JVMDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String");
        Method[] m = c.getDeclaredMethods();
        int count = 0;
        for(Method method:m){
            System.out.println(method.getName());
            count++;
        }
        System.out.println(count);
    }
}
