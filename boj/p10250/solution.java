package boj.p10250;

import java.util.*;
import java.io.*;

class Main {

    static int testCase, h, w, n;
    static int YY, XX;
    static StringBuilder sb = new StringBuilder();

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            String line = br.readLine();
            st = new StringTokenizer(line);
            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            solve();
        }
    }

    private static void solve() {

        YY = (n%h != 0) ? n%h : h;

        if (n/h == 0 || n == h) {
            XX = 1;
        } else if (n/h != 0 && n%h == 0) {
            XX = n/h;
        } else {
            XX = (n/h)+1;
        }

        StringBuilder result = new StringBuilder();
        result.append(YY);
        if (XX < 10) {
            result.append(0).append(XX);
        } else {
            result.append(XX);
        }

        sb.append(result).append('\n');
    }

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(sb.toString());
    }
}
