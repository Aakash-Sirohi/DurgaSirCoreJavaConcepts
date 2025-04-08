import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        FileInputStream fis = new FileInputStream("db.properties");
        props.load(fis);
        String url = props.getProperty("url");
        String username = props.getProperty("username");
        String password = props.getProperty("password");
        Connection con = DriverManager.getConnection(url, username, password);
    }
}
