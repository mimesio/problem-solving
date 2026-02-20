package boj.p1003;

import java.io.*;

class Main {

    static int[] fibo = new int[41];
    static StringBuilder output = new StringBuilder();

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            int n = Integer.parseInt(br.readLine());
            int zeroCount = getZeroCount(n);
            int oneCount = getOneCount(n);
            output.append(zeroCount).append(" ").append(oneCount).append("\n");
        }
        System.out.println(output.toString());
    }

    public static void initFibo () {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= 40; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
    }

    public static int fibonacci(int n) {
        return fibo[n];
    }

    public static int getZeroCount(int n) {
        if (n == 0) {
            return 1;
        } else {
            return fibonacci(n-1);
        }
    }

    public static int getOneCount(int n) {
        return fibonacci(n);
    }

    public static void main(String[] args) throws IOException {
        initFibo();
        solve();
    }
}