package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db;

import java.io.IOException;
import java.util.Properties;

public class DBProperties {
    private static Properties properties = new Properties();
    static {
        try {
            properties.load(DBProperties.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String host(){
        return properties.get("db.host").toString();
    }
    public static int port(){
        try {
            return Integer.parseInt(properties.get("db.port").toString());
        } catch (NumberFormatException e) {
            return 3306;
        }
    }
    public static String userName(){
        return properties.get("db.username").toString();
    }
    public static String password(){
        return properties.get("db.password").toString();
    }
    public static String dataName(){
        return properties.get("db.dbname").toString();
    }
    public static String option(){
        return properties.get("db.option").toString();
    }



}
