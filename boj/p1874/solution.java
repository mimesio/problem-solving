package boj.p1874;

import java.util.*;
import java.io.*;


class Main {

    static int n;
    static int output[];
    static Deque<Integer> stack = new ArrayDeque<>();
    static StringBuilder operations = new StringBuilder();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void solve() {

        for (int i = 1; i <= output[0]; i++) {
            push(i);
        }
        int pre = pop(output[0]);
        int max = pre;

        for (int i = 1; i < n; i++) {
            if (output[i] < pre) {
                pre = pop(output[i]);
            }
            else {
                for (int j = max + 1; j <= output[i]; j++) {
                    push(j);
                }
                pre = pop(output[i]);
                max = pre;
            }
        }
    }

    private static void isEqual(int top, int output) {
        if (top != output) {
            System.out.println("NO");
            System.exit(0);
        }
    }

    private static void push(int x) {
        stack.push(x);
        operations.append("+").append("\n");
    }

    private static int pop(int output) {
        int top = stack.pop();
        isEqual(top, output);

        operations.append("-").append("\n");
        return top;
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
        System.out.println(operations.toString());
    }
}