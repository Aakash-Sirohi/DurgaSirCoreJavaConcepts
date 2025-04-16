import java.util.Locale;

public class InternationalizationDemo {
    public static void main(String[] args) {
        Locale l1 = Locale.getDefault();
        System.out.println(l1.getCountry() + " " + l1.getLanguage());
        System.out.println(l1.getDisplayCountry() +  " " + l1.getDisplayLanguage());
        Locale l2 = new Locale("pa","IN");
        Locale.setDefault(l2);
        System.out.println(Locale.getDefault().getDisplayCountry() + " " + Locale.getDefault().getDisplayLanguage());
        String [] s3 = Locale.getISOLanguages();
        for(String s:s3){
            System.out.println(s);
        }
        String [] s4 = Locale.getISOCountries();
        for(String s:s4){
            System.out.println(s);
        }
        Locale[] s = Locale.getAvailableLocales();
        for(Locale l:s){
            System.out.println(l.getDisplayCountry() + " " + l.getDisplayLanguage());
        }
    }
}
