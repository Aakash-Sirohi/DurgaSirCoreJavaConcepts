import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class InternationalizationDemo4 {
    public static void main(String[] args) {
        DateFormat df = DateFormat.getDateTimeInstance(0,0, Locale.US);
        System.out.println(df.format(new Date()));
    }
}
