package hashMapAndArrayList;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class ReadpropfileConverIntoHasMop {
    public static void main(String[] args) throws IOException {

       /* FileInputStream file = new FileInputStream("src/hashMapAndArrayList/menad.properties");
        Properties properties = new Properties();
        properties.load(file);
        ArrayList<String> user = new ArrayList<>();
        user.add(properties.getProperty("usr1"));
        user.add(properties.getProperty("usr2"));
        user.add(properties.getProperty("usr3"));
        user.add(properties.getProperty("usr4"));

        ArrayList<String> password = new ArrayList<>();
        password.add(properties.getProperty("password1"));
        password.add(properties.getProperty("password2"));
        password.add(properties.getProperty("password3"));
        password.add(properties.getProperty("password4"));
        System.out.println(user);
        System.out.println(password);
         student.put((properties.getProperty("usr1")), (properties.getProperty("password1")));
         student.put((properties.getProperty("usr2")), (properties.getProperty("password2")));
        student.put((properties.getProperty("usr3")), (properties.getProperty("password3")));
        student.put((properties.getProperty("usr4")), (properties.getProperty("password4")));
*/

        System.out.println("-----------------differentusers with different passwords------------------");
        HashMap<String, String> student = new HashMap<>();
        student.put(FileRead.fileread("src/hashMapAndArrayList/menad.properties", "usr1"), FileRead.fileread("src/hashMapAndArrayList/menad.properties", "password1"));
        student.put(FileRead.fileread("src/hashMapAndArrayList/menad.properties", "usr2"), FileRead.fileread("src/hashMapAndArrayList/menad.properties", "password2"));
        student.put(FileRead.fileread("src/hashMapAndArrayList/menad.properties", "usr3"), FileRead.fileread("src/hashMapAndArrayList/menad.properties", "password3"));
        student.put(FileRead.fileread("src/hashMapAndArrayList/menad.properties", "usr4"), FileRead.fileread("src/hashMapAndArrayList/menad.properties", "password4"));


        System.out.println(student);
        Iterator ita = student.entrySet().iterator();
        while (ita.hasNext()) {
            System.out.println(ita.next());
        }


    }

}
