package anagramDemo;

import properties.ReadPropertiesFileClass;

import java.io.IOException;
import java.util.Arrays;

public class SentenceDuplicate {
    public static void main(String[] args) throws IOException {


        String sentence = ReadPropertiesFileClass.readPropertiesFile("src/anagramDemo/sentence.properties", "sentence");
        String ArrOfSentence[] = sentence.split(" ");
        System.out.println(ArrOfSentence.length);
        Arrays.sort(ArrOfSentence);

        for (int i = 0; i < ArrOfSentence.length; i++) {
            System.out.println(ArrOfSentence[i]);
        }
        int j, k ;
        String l = null;
        for (k = 0; k < ArrOfSentence.length; k++) {
            for (j = k + 1; j < ArrOfSentence.length; j++) {
                if (ArrOfSentence[k].equals(ArrOfSentence[j])) {
                    l = ArrOfSentence[j];
                    System.out.println("the duplicated element is " +l);
                    //System.out.println("the element duplicated is: " + ArrOfSentence[k] + "  and the inexes are  " + k + " and " + j);
                    break;
                }
            }
        }
        if (k == ArrOfSentence.length - 1) {
            System.out.println("there is no duplicated element");
        }
    }
}