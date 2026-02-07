package boj.p9012;

import java.util.*;
import java.io.*;

class Main {

    static String[] PS;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        PS = new String[testCase];
        for (int i = 0; i < testCase; i++) {
            PS[i] = br.readLine();
        }
    }

    public static void solve() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < PS.length; i++) {
            sb.append(isVPS(PS[i])).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static String isVPS(String line) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : line.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}