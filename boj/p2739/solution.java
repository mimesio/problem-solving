package boj.p2739;

import java.io.*;

class Main {
    static int n;

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }
    }

    private static void printMultiplication() {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", n, i, (n*i));
        }
    }

    public static void main(String[] args) {
        input();
        printMultiplication();
    }
}