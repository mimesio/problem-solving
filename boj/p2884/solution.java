package boj.p2884;

import java.util.*;
import java.io.*;

class Main {

    static int h, m;

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            h = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
        } catch (Exception e) {

        }
    }

    private static void solve() {
        if (m - 45 < 0) {
            m = 60 + (m - 45);
            h--;
        } else {
            m -= 45;
        }

        if (h < 0) {
            h = 23;
        }
    }

    public static void main(String[] args) {
        input();
        solve();
        System.out.println(h + " " + m);
    }
}
