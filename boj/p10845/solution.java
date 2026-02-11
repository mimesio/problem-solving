package boj.p10845;

import java.util.*;
import java.io.*;

class Main {

    static LinkedList<Integer> queue = new LinkedList<>();
    static StringBuilder output = new StringBuilder();
    static String operations[];


    private static void push(int X) {
        queue.add(X);
    }

    private static void pop() {
        if (!queue.isEmpty()) {
            int front = queue.removeFirst();
            output.append(front).append("\n");
        } else {
            output.append("-1").append("\n");
        }
    }

    private static void size() {
        int size = queue.size();
        output.append(size).append("\n");
    }

    private static void empty() {
        if (queue.isEmpty()) {
            output.append("1").append("\n");
        } else {
            output.append("0").append("\n");
        }
    }

    private static void front() {
        if (!queue.isEmpty()) {
            int front = queue.getFirst();
            output.append(front).append("\n");
        } else {
            output.append("-1").append("\n");
        }
    }

    private static void back() {
        if (!queue.isEmpty()) {
            int back = queue.getLast();
            output.append(back).append("\n");
        } else {
            output.append("-1").append("\n");
        }
    }

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        operations = new String[n];

        for (int i = 0; i < n; i++) {
            operations[i] = br.readLine();
        }
    }

    public static void solve() {
        StringTokenizer st;
        for (String operation : operations) {
            st = new StringTokenizer(operation);
            String s = st.nextToken();
            if (st.hasMoreTokens()) {
                int X = Integer.parseInt(st.nextToken());
                if (s.equals("push")) {
                    push(X);
                }
            }
            else {
                if (s.equals("pop")) pop();
                else if (s.equals("size")) size();
                else if (s.equals("empty")) empty();
                else if (s.equals("front")) front();
                else back();
            }
        }
        System.out.println(output.toString());
    }

    public static void main(String[] args) throws IOException{
        input();
        solve();
    }
}


