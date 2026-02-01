package boj.p1929;

import java.util.*;
import java.io.*;

class Main {

    static int start, end;

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());
    }

    private static boolean[] getPrimeArr() {

        boolean[] isPrime = new boolean[end + 1];

        for (int i = 2; i <= end; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i < Math.sqrt(end) + 1; i++) {
            if (!isPrime[i]) continue;

            for (int j = 2; i * j <= end; j++) {
                isPrime[i * j] = false;
            }
        }

        return isPrime;
    }

    private static void solve(boolean[] isPrime) {
        for (int i = start; i <= end; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        solve(getPrimeArr());
    }

}
