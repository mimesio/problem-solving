package boj.p2577;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

class Main {

    static HashMap<Character, Integer> map = new HashMap<>();
    static int a, b, c;
    static char[] arr;

    private static void initializeHashMap() {
        for (char c = '0'; c <= '9'; c++) {
            map.put(c, 0);
        }
    }

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
    }

    private static int multiply() {
        return a * b * c;
    }

    private static void countUp(String multiplication) {
        arr = multiplication.toCharArray();
        for (char num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }

    private static void print() {
        for (Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) throws IOException {
        initializeHashMap();
        input();
        countUp(String.valueOf(multiply()));
        print();
    }
}