package boj.p11720;

import java.io.*;

class Main {
    static char[] arr;
    static int result;
    static String line;

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        line = br.readLine();

    }

    private static void solve() {
        arr = line.toCharArray();
        for (char c : arr) {
            result += Integer.parseInt(String.valueOf(c));
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}