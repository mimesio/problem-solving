package boj.p11866;

import java.util.*;
import java.io.*;

class Main {

    static int N, K;

    static Queue<Integer> queue = new ArrayDeque<>();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }

    public static void init() {
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
    }

    public static void solve() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int count = 0;
        while (!queue.isEmpty()) {
            while(count < K-1) {
                int value = queue.poll();
                queue.offer(value);
                count++;
            }
            count = 0;
            sb.append(queue.poll());

            if (!queue.isEmpty()) {
                sb.append(", ");
            } else {
                sb.append(">");
            }
        }

        System.out.println(sb.toString());
    }


    public static void main(String[] args) throws IOException{
        input();
        init();
        solve();
    }
}

