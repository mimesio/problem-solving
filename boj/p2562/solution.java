package boj.p2562;

import java.io.*;

class Main {
    static int max = 0;
    static int idx;
    static int arr[] = new int[9];

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 9; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
        } catch (Exception e) {

        }
    }

    private static void solve() {
        for (int i = 0; i < 9; i++) {
            if(arr[i] > max) {
                max = arr[i];
                idx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }

    public static void main(String[] args) {
        input();
        solve();
    }
}
