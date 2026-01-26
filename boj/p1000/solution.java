package boj.p1000;

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());
            System.out.println(n1+n2);
        } catch (Exception e) {

        }
    }
}