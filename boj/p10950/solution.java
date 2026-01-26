package boj.p10950;

import java.util.*;
import java.io.*;

class Main {
    static int n;

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());

            StringTokenizer st;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < n; i++) {
                String line = br.readLine();
                st = new StringTokenizer(line);

                int n1 = Integer.parseInt(st.nextToken());
                int n2 = Integer.parseInt(st.nextToken());

                sb.append(n1 + n2).append("\n");
            }

            System.out.println(sb);

        } catch (Exception e) {

        }

    }
}