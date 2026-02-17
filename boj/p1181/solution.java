package boj.p1181;

import java.util.*;
import java.io.*;

class Main {

    public static Set<String> input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();

        for (int i = 0; i < n; i++) {
            words.add(br.readLine());
        }
        return words;
    }

    public static String[] sort(String[] wordList) {
        Arrays.sort(wordList, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });
        return wordList;
    }

    public static void print(String[] sortedWords) {
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) throws IOException {
        Set<String> words = input();
        String[] wordList = words.toArray(new String[0]); // HashSet -> String[]
        String[] sortedWords = sort(wordList);
        print(sortedWords);
    }
}