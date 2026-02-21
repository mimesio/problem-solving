package boj.p1463;

import java.io.*;

class Main {

    static int x;
    static int[] memo = new int[1000001];

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine());
    }

    public static int operation(int x) {
        if (x == 1) return 0;
        if (memo[x] != 0) {
            return memo[x];
        }

        int result1 = Integer.MAX_VALUE;
        int result2 = Integer.MAX_VALUE;
        int result3;

        if (x%3 == 0) {
            result1 = operation(x/3);
        }
        if (x%2 == 0) {
            result2 = operation(x/2);
        }
        result3 = operation(x-1);

        memo[x] = getMin(result1, result2, result3) + 1;
        return memo[x];
    }

    private static int getMin(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    public static void solve() {
        memo[2] = 1;
        memo[3] = 1;
        System.out.print(operation(x));
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}