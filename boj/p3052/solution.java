package boj.p3052;

import java.io.*;

class Main {

    static int[] arr = new int[42];
    static int count = 0;

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n%42]++;
        }
    }

    private static void countUp() {
        for ( int n : arr ) {
            if (n > 0) {
                count++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        countUp();
        System.out.println(count);
    }
}