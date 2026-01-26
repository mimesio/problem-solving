package boj.p2753;

import java.io.*;

class Main {
    static int year;

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            year = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }
    }

    private static int solve() {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        input();
        System.out.println(solve());
    }
}