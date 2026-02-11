package boj.p18110;

import java.io.*;
import java.util.*;

class Main {

    static int n;
    static int[] difficultyLevel;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        difficultyLevel = new int[n];
        for (int i = 0; i < n; i++) {
            difficultyLevel[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void solve() {
        int exclusion = getExclusion();

        Arrays.sort(difficultyLevel);

        int level = getLevel(exclusion);

        System.out.println(level);
    }

    private static int getLevel(int exclusion) {
        int sum = 0;
        for (int i = exclusion; i < n-exclusion; i++) {
            sum += difficultyLevel[i];
        }

        return Math.round(sum / (float) (n-2*exclusion));
    }

    private static int getExclusion() {
        return Math.round(n * 15 / (float) 100);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}