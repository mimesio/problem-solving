package boj.p11047;

import java.util.*;
import java.io.*;

class Main {

    static int n, target;
    static int[] type;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        type = new int[n];

        for (int i = 0; i < n; i++) {
            type[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void solve() {
        int count = 0;
        for (int i = n-1; i >= 0; i--) {
            if (type[i] > target) {
                continue;
            } else {
                while (type[i] <= target) {
                    target -= type[i];
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}