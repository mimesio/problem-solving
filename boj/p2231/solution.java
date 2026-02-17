package boj.p2231;

import java.io.*;

class Main {

    static int target;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        target = Integer.parseInt(br.readLine());
    }

    public static void solve() {
        int n = 0;
        while(n < target) {
            int decompositionSum = ++n;
            int num = decompositionSum;
            while(num > 0) {
                decompositionSum += num % 10;
                num /= 10;
            }
            if (decompositionSum == target) {
                System.out.println(n);
                return;
            }
        }
        System.out.println(0);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}


