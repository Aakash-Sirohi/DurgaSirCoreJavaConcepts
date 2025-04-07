import java.util.Comparator;
import java.util.TreeSet;

public class Employee implements Comparable{
    String name;
    int id;
    Employee(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String toString(){
        return name + "--" + id;
    }
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        return this.id - e.id;
    }
}
class MyComparator5 implements Comparator {
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.name.compareTo(e2.name);
    }
}
class CompComp{
    public static void main(String[] args) {
        Employee e1 = new Employee("nag", 100);
        Employee e2 = new Employee("balaiah", 200);
        Employee e3 = new Employee("chiru", 50);
        Employee e4 = new Employee("venki", 150);
        Employee e5 = new Employee("nag", 100);
        TreeSet ts = new TreeSet();
        ts.add(e1);
        ts.add(e2);
        ts.add(e3);
        ts.add(e4);
        ts.add(e5);
        System.out.println(ts);
        TreeSet ts2 = new TreeSet(new MyComparator5());
        ts2.add(e1);
        ts2.add(e2);
        ts2.add(e3);
        ts2.add(e4);
        ts2.add(e5);
        System.out.println(ts2);
    }
}
