enum Beer2{
    KO,KF,RC,FO;
    Beer2(){
        System.out.println("constructor");
    }
}

public class EnumerationDemo2 {
    public static void main(String[] args) {
        Beer2 beer =Beer2.RC;
        System.out.println("Hello");
    }
}
