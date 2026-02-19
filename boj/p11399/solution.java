package boj.p11399;

import java.util.*;
import java.io.*;

class Main {

    static int[] times;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        times = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            times[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void solve() {
        Arrays.sort(times);

        int sum = 0;
        int waitTime = 0;
        for (int currTime: times) {
            sum += waitTime + currTime;
            waitTime += currTime;
        }

        System.out.print(sum);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}
