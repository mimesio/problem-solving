package boj.p11723;

import java.util.*;
import java.io.*;

class Main {

    static Set<Integer> set = new HashSet<>();
    static StringBuilder output = new StringBuilder();

    public static void add(int x) {
        set.add(x);
    }

    public static void remove(int x) {
        set.remove(x);
    }

    public static int check(int x) {
        if (set.contains(x)) return 1;
        return 0;
    }

    public static void toggle(int x) {
        if (set.contains(x)) {
            set.remove(x);
        } else {
            set.add(x);
        }
    }

    public static void all() {
        set.clear();
        for (int i = 1; i <= 20; i++) {
            set.add(i);
        }
    }

    public static void empty() {
        set.clear();
    }

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            solve(new StringTokenizer(br.readLine()));
        }
    }

    public static void solve(StringTokenizer st) {
        String operation = st.nextToken();
        int x = 0;
        if (st.hasMoreTokens()) {
            x = Integer.parseInt(st.nextToken());
        }

        if (operation.equals("add")) {
            add(x);
        } else if (operation.equals("remove")) {
            remove(x);
        } else if (operation.equals("check")) {
            output.append(check(x)).append("\n");
        } else if (operation.equals("toggle")) {
            toggle(x);
        } else if (operation.equals("all")) {
            all();
        } else { // operation.equals("empty")
            empty();
        }
    }

    public static void main(String[] args) throws IOException{
        input();
        System.out.print(output.toString());
    }
}