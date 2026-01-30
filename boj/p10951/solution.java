package boj.p10951;

import java.util.*;
import java.io.*;

class Main {

    static int n1, n2;

    private static void solve() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;

            while(true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }

                st = new StringTokenizer(line);
                n1 = Integer.parseInt(st.nextToken());
                n2 = Integer.parseInt(st.nextToken());

                System.out.println(n1+n2);

            }
        } catch (Exception e) {
            
        }
    }
    public static void main(String[] args) {
        solve();
    }
}