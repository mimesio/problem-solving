package boj.p2609;

import java.util.*;
import java.io.*;

class Main {
    static int n1, n2;
    static int GCD, LCM;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
    }

    public static void solve() {
        int min = Math.min(n1, n2);
        GCD = 1;

        for (int i = 2; i <= min; i++) {
            while (n1 % i == 0 && n2 % i == 0) {
                n1 /= i;
                n2 /= i;
                GCD *= i;
            }
        }

        LCM = GCD * n1 * n2;
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
        System.out.println(GCD);
        System.out.println(LCM);
    }
}