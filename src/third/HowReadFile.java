package third;

import java.io.*;
import java.util.ArrayList;

public class HowReadFile {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("C:\\Users\\sadou\\OneDrive\\Desktop\\note\\note.txt");
        BufferedReader be = new BufferedReader(fr);
        String x;
        String y=null;
        ArrayList<String> text = new ArrayList<>();
        while (( x=be.readLine())!=null)
    {
        //y=y+x;
        System.out.println(x);
        text.add(x);

    }
        System.out.println(text);
        //System.out.println(y);
    }
}
