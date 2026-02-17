package boj.p1676;

import java.io.*;

class Main {

    public static int input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public static int solve(int n) {
        int count = 0;
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        int n = input();
        System.out.println(solve(n));
    }
}
