package org.example;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacterSet {

    public static Set<Character> getUniqueCharacterSet(String[] texts, String word1, String word2) {
        Set<Character> uniqueChars = new HashSet<>();
        boolean foundWord1 = false;
        boolean foundWord2 = false;

        for (String text : texts) {
            // Tüm karakterleri kümeye ekle
            for (char c : text.toCharArray()) {
                uniqueChars.add(c);
            }

            // İki kelimenin her ikisini de bulup bulmadığımızı kontrol et
            if (text.contains(word1)) {
                foundWord1 = true;
            }
            if (text.contains(word2)) {
                foundWord2 = true;
            }

            // Eğer her iki kelime de bulunmuşsa, döngüyü sonlandır
            if (foundWord1 && foundWord2) {
                break;
            }
        }

        // Eğer her iki kelime de bulunamamışsa, boş bir küme döndür
        if (!(foundWord1 && foundWord2)) {
            return new HashSet<>();
        }

        return uniqueChars;
    }

    public static void main(String[] args) {
        String[] texts = {"hello world", "java coding", "unique characters"};
        String word1 = "hello";
        String word2 = "java";

        Set<Character> uniqueCharacters = getUniqueCharacterSet(texts, word1, word2);
        System.out.println("Unique characters set: " + uniqueCharacters);
    }
}

