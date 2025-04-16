import java.text.NumberFormat;
import java.util.Locale;

public class InternationalizationDemo2 {
    public static void main(String[] args) {
        double d = 123456.789;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
        Locale INDIA = new Locale("pa", "IN");
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(d));
        System.out.println(nf1.format(d));
        System.out.println(nf2.format(d));
    }
}
