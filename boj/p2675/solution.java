package boj.p2675;

import java.util.*;
import java.io.*;

class Main {

    static int testCase;
    static int loop;
    static String word;
    static StringBuilder sb = new StringBuilder();


    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        testCase = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < testCase; i++) {
            st = new StringTokenizer(br.readLine());
            loop = Integer.parseInt(st.nextToken());
            word = st.nextToken();
            solve();
        }
    }

    private static void solve() {
        for (char c : word.toCharArray()) {
            for (int i = 0; i < loop; i++) {
                sb.append(c);
            }
        }
        sb.append("\n");
    }

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(sb.toString());
    }
}