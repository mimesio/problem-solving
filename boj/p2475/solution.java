package boj.p2475;

import java.util.*;
import java.io.*;

class Main {

    static int arr[] = new int[5];
    static int squaredSum;

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();

            StringTokenizer st = new StringTokenizer(line);
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e)
        {

        }
    }

    private static int solve() {
        for (int n : arr) {
            squaredSum += (int) Math.pow(n, 2);
        }
        return squaredSum % 10;
    }


    public static void main(String[] args) {
        input();
        System.out.println(solve());
    }
}