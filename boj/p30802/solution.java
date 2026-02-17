package boj.p30802;

import java.util.*;
import java.io.*;

class Main {
    static int[] sizes = new int[6];
    static int n, T, P;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            sizes[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        T = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());
    }

    public static void solve() {
        StringBuilder output = new StringBuilder();

        int tshirtBundle = 0;
        for (int size : sizes) {
            tshirtBundle += (int) Math.ceil(size / (double) T);
        }

        int penBundle = n / P;
        int scarcePen = 0;
        if (n != penBundle * P) {
            scarcePen = n - penBundle * P;
        }

        output.append(tshirtBundle).append("\n");
        output.append(penBundle).append(" ").append(scarcePen);
        System.out.println(output.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}