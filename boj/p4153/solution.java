package boj.p4153;

import java.util.*;
import java.io.*;

class Main {

    public static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        StringTokenizer st;
        int[] s = new int[3];

        while (true) {
            st = new StringTokenizer(br.readLine());
            s[0] = Integer.parseInt(st.nextToken());
            s[1] = Integer.parseInt(st.nextToken());
            s[2] = Integer.parseInt(st.nextToken());

            Arrays.sort(s);

            if (s[0] == 0 && s[1] == 0 && s[2] == 0) break;
            else if (isRightTriangle(s[0], s[1], s[2])) {
                output.append("right\n");
            } else {
                output.append("wrong\n");
            }
        }
        System.out.println(output.toString());
    }

    public static boolean isRightTriangle(int a, int b, int c) {
        return c * c == a * a + b * b;
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}