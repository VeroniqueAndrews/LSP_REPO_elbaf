package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordCounting {
    public static void main(String[] args) {
        String wordsPath = "words.txt";

        // check if the file exists 
        File file = new File(wordsPath);
        if (file.exists()){
            // read file
            HashMap<String, Integer> wordCounts = new HashMap<>();
             try {
                Scanner scanner = new Scanner(file);

                //add words from file to hash map
                while (scanner.hasNext());
                String word = scanner.next();
                
                if (word.length() > 3) {
                    word = word.toLowerCase();
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);

                }
                
            } 

        }

        
    }

}
 