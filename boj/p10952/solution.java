package boj.p10952;

import java.util.*;
import java.io.*;

class Main {

    static int n1, n2;

    private static void solve() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String line;
        StringBuilder sb = new StringBuilder();

        while(!(line = br.readLine()).equals("0 0")) {
            st = new StringTokenizer(line);
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());
            sb.append(n1+n2).append("\n");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        solve();
    }
}