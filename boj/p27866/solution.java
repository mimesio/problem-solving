package boj.p27866;

import java.io.*;

class Main {
    static String str;
    static int n;

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
            n = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }
    }

    private static void solve() {
        System.out.println(str.charAt(n-1));
    }

    public static void main(String[] args) {
        input();
        solve();
    }
}