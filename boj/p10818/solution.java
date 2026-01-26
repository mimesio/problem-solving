package boj.p10818;

import java.util.*;
import java.io.*;

class Main {
    static int n;
    static int arr[];
    static int min, max;

    private static void input() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
            arr = new int[n];

            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {

        }
    }

    private static void getMinMax() {
        min = arr[0];
        max = arr[0];

        for (int i : arr) {
            if(i < min) {
                min = i;
            }
            if(i > max) {
                max = i;
            }
        }
    }

    public static void main(String[] args) {
        input();
        getMinMax();
        System.out.println(min + " " + max);
    }
}