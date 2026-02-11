package boj.p10773;

import java.util.*;
import java.io.*;

class Main {

    static int[] input;
    static Deque<Integer> stack = new ArrayDeque<>();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }
    }

    private static void initStack() {
        for (int num : input) {
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
    }

    public static void solve() {
        initStack();

        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }

    public static void main(String[] args) throws IOException{
        input();
        solve();
    }
}
