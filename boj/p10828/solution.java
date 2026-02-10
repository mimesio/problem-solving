package boj.p10828;

import java.util.*;
import java.io.*;

class Main {

    static Deque<Integer> stack = new ArrayDeque<>();
    static int N;
    static String[] operations;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        operations = new String[N];
        for (int i = 0; i < N; i++) {
            operations[i] = br.readLine();
        }
    }

    public static void solve() {
        StringTokenizer st;
        String operation;
        int item = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(operations[i]);
            operation = st.nextToken();
            if (st.hasMoreTokens()) {
                item = Integer.parseInt(st.nextToken());
            }

            if (operation.equals("push")) {
                push(item);
            } else if (operation.equals("pop")) {
                sb.append(pop()).append("\n");
            } else if (operation.equals("size")) {
                sb.append(size()).append("\n");
            } else if (operation.equals("empty")) {
                sb.append(empty()).append("\n");
            } else { // operation.equals("top")
                sb.append(top()).append("\n");
            }
        }

        System.out.print(sb.toString());
    }

    private static void push(int X) {
        stack.push(X);
    }

    private static int pop() {
        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.pop();
        }
    }

    private static int size() {
        return stack.size();
    }

    private static int empty() {
        return stack.isEmpty() ? 1 : 0;
    }

    private static int top() {

        if (stack.isEmpty()) {
            return -1;
        } else {
            return stack.peek();
        }
    }


    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}