package properties;

import jdbc.ConnectionToSql;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {

        HashMap<String, String> user = new HashMap<>();

        FileInputStream f = new FileInputStream("src/hashMapAndArrayList/menad.properties");
        Properties prop = new Properties();
        prop.load(f);

        user.put("user1", prop.getProperty("usr1"));
        user.put("user2", prop.getProperty("usr2"));
        user.put("user3", prop.getProperty("usr3"));
        user.put("user4", prop.getProperty("usr4"));

        for (Map.Entry m : user.entrySet()) {

            System.out.println(m.getKey() + "=" + m.getValue());

        }


    }

}
