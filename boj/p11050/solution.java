package boj.p11050;

import java.util.*;
import java.io.*;

class Main {

    static int N, K;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    public static int getCombination() {
        int result = 1;

        for (int i = N; i > 1; i--) {
            result *= i;
        }
        for (int i = K; i > 1; i--) {
            result /= i;
        }
        for (int i = N-K; i > 1; i--) {
            result /= i;
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(getCombination());
    }
}