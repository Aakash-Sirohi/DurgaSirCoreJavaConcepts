import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class InternationalizationDemo3 {
    public static void main(String[] args) {
        DateFormat df1 = DateFormat.getDateInstance(0, Locale.US);
        DateFormat df2 = DateFormat.getDateInstance(0, Locale.UK);
        DateFormat df3 = DateFormat.getDateInstance(0, Locale.ITALY);
//        DateFormat df4 = DateFormat.getDateInstance(3, Locale.US);
        System.out.println(df1.format(new Date()));
        System.out.println(df2.format(new Date()));
        System.out.println(df3.format(new Date()));
//        System.out.println(df4.format(new Date()));
    }
}
