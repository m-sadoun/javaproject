package anagramDemo;

import java.util.Arrays;

public class AnagramTeacherDemo {

    public static void angram(String s1, String s2) {
        char word1[] = s1.toCharArray();
        char word2[] = s2.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        if (s1.length() != s2.length()) {

            System.out.println(" not anagram");
        } else if (Arrays.equals(word1, word2)) {

            System.out.println("the words ara angaram");
        } else {
            System.out.println("the two words are not angaram");
        }

    }

    public static void main(String[] args) {
        angram("cat", "actl");

    }
}

