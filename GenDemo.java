class Gen<T>{
    T ob;
    Gen(T ob){
        this.ob = ob;
    }
    public void show(){
        System.out.println("The type of ob is: "+ob.getClass().getName());
    }
    public T getOb(){
        return ob;
    }
}

public class GenDemo {
    public static void main(String[] args){
        Gen<String> g1 = new Gen<>("Hello");
        g1.show();
        System.out.println(g1.getOb());
        Gen<Double> g2 = new Gen<>(3.14);
        g2.show();
        System.out.println(g2.getOb());
        Gen<Integer> g3 = new Gen<>(1);
        g3.show();
        System.out.println(g3.getOb());

     }
}
