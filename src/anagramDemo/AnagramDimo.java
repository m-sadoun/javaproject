package anagramDemo;

import properties.ReadPropertiesFileClass;

import java.io.IOException;
import java.util.Arrays;

public class AnagramDimo {

    public static void main(String[] args) throws IOException {
        String s1 = ReadPropertiesFileClass.readPropertiesFile("src/anagramDemo/StringExample.properties", "String1");
        String s2 = ReadPropertiesFileClass.readPropertiesFile("src/anagramDemo/StringExample.properties", "String2");
        if (s1.length() != s2.length()) {
            System.out.println(s1 + "  and  " + s2 + " are not anagrm1");
        } else {
            char charofs1[] = s1.toCharArray();
            char charofs2[] = s2.toCharArray();
            Arrays.sort(charofs1);
            Arrays.sort(charofs1);

            for (int i = 0; i < charofs1.length; i++) {
                if ((charofs1[i] == charofs2[i]) && (i == charofs1.length - 1)) {

                    System.out.println(s1 + " and " + s2 + " are angram");
                } else {
                    System.out.println(s1 + " and " + s2 + " are not angram");
                    break;

                }
            }
        }
    }
}
