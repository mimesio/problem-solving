package boj.p2741;

import java.util.*;
import java.io.*;

class Main {

    static int n;

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }
    }

    private static void print() {
        for (int i = 1; i <=n; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        input();
        print();
    }
}