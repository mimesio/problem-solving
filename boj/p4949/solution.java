package boj.p4949;

import java.util.*;
import java.io.*;

class Main {

    static ArrayList<String> lines = new ArrayList<>();
    static StringBuilder output = new StringBuilder();

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String line = br.readLine();
            if (line.equals(".")) {
                break;
            } else {
                lines.add(line);
            }
        }
    }

    private static void checkBalance(String line) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : line.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            }
            else if (c == '[') {
                stack.push(']');
            }
            else if (c == ')' || c == ']') {
                if (!stack.isEmpty() && c == stack.peek()) {
                    stack.pop();
                } else {
                    output.append("no").append('\n');
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            output.append("yes").append('\n');
        } else {
            output.append("no").append('\n');
        }
    }

    public static void solve() {
        for (String line : lines) {
            checkBalance(line);
        }
        System.out.println(output.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}

