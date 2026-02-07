package boj.p2164;

import java.util.*;
import java.io.*;

class Main {

    static int N;
    static Queue<Integer> queue = new ArrayDeque<>();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
    }

    public static void init() {
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
    }

    public static void solve() {
        while (queue.size() > 2) {
            queue.poll();
            queue.add(queue.poll());
        }

        if (queue.size() == 2) {
            queue.poll();
            System.out.println(queue.poll());
        } else {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        init();
        solve();
    }
}

