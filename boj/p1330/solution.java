package boj.p1330;

import java.util.*;
import java.io.*;

class Main {
    static int n1, n2;

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());

        } catch (Exception e) {

        }
    }

    private static String compare() {
        if (n1 > n2) {
            return ">";
        } else if (n1 < n2) {
            return "<";
        } else {
            return "==";
        }
    }

    public static void main(String[] args) {
        input();
        System.out.println(compare());
    }
}