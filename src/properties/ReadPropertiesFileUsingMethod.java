package properties;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadPropertiesFileUsingMethod {
    public static void main(String[] args) throws IOException {

        String location ="src/hashMapAndArrayList/menad.properties";
        HashMap<String, String> users =new HashMap<>();
        users.put("user1",ReadPropertiesFileClass.readPropertiesFile(location,"usr1"));
        users.put("user2",ReadPropertiesFileClass.readPropertiesFile(location,"usr2"));
        users.put("user3",ReadPropertiesFileClass.readPropertiesFile(location,"usr3"));
        users.put("user4",ReadPropertiesFileClass.readPropertiesFile(location,"usr3"));
        System.out.println(users);
        for (Map.Entry m : users.entrySet()) {

            System.out.println(m.getKey() + "=" + m.getValue());

        }



    }


}
