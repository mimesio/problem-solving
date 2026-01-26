package boj.p10809;

import java.util.*;
import java.io.*;

class Main {
    static String word;
    static HashMap<Character, Integer> map = new HashMap<>();

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            word = br.readLine();
        } catch (Exception e) {

        }
    }

    private static void solve() {
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, -1);
        }

        for (char c : word.toCharArray()) {
            map.replace(c, word.indexOf(c));
        }
    }

    public static void main(String[] args) {
        input();
        solve();
        for (int e: map.values()) {
            System.out.print(e + " ");
        }
    }
}