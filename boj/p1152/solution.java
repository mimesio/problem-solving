package boj.p1152;

import java.util.*;
import java.io.*;

class Main {
    static int n;

    private static void solve() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);

        while (st.hasMoreTokens()) {
            st.nextToken();
            n++;
        }
        System.out.println(n);
    }

    public static void main(String[] args) throws IOException{
        solve();
    }
}