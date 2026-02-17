package boj.p1978;

import java.util.*;
import java.io.*;

class Main {

    static int n;
    static int[] nums;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void solve() {
        int count = 0;
        for (int num : nums) {
            if (isPrime(num)) count++;
        }
        System.out.println(count);
    }

    private static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}