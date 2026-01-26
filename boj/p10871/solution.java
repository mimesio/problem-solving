package boj.p10871;

import java.util.*;
import java.io.*;

class Main {

    static int n, key;
    static StringTokenizer st;

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            String[] parts = line.split(" ");
            n = Integer.parseInt(parts[0]);
            key = Integer.parseInt(parts[1]);

            st = new StringTokenizer(br.readLine());
        } catch (Exception e) {
        }
    }

    private static void solve() {
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num < key) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        input();
        solve();
    }
}