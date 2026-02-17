package boj.p1436;

import java.io.*;

class Main {

    public static int input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    public static void solve(int n) {
        int count = 0;
        int num = 656;
        while (n != count) {
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) throws IOException {
        int n = input();
        solve(n);
    }
}