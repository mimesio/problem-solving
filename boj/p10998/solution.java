package boj.p10998;

import java.util.*;
import java.io.*;

class Main {

    static int n1, n2;

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();

            StringTokenizer st = new StringTokenizer(line);
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());

        } catch(Exception e) {

        }
    }

    private static int multiply() {
        return n1 * n2;
    }

    public static void main(String[] args) {
        input();
        System.out.println(multiply());
    }
}