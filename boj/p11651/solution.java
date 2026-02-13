package boj.p11651;

import java.util.*;
import java.io.*;

class Main {

    static int n;
    static int[][] dots;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dots = new int[n][2];

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            dots[i][0] = Integer.parseInt(st.nextToken());
            dots[i][1] = Integer.parseInt(st.nextToken());
        }
    }

    public static void sort() {
        Arrays.sort(dots, (dot1, dot2) -> {
            if (dot1[1] == dot2[1]) {
                return Integer.compare(dot1[0], dot2[0]);
            } else {
                return Integer.compare(dot1[1], dot2[1]);
            }
        });
    }

    public static void print() {
        StringBuilder output = new StringBuilder();

        for (int[] dot : dots) {
            output.append(dot[0]).append(" ").append(dot[1]).append("\n");
        }

        System.out.print(output.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        sort();
        print();
    }
}