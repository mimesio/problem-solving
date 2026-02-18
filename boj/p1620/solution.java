package boj.p1620;

import java.util.*;
import java.io.*;

class Main {

    static Map<Integer, String> nameByIdx = new HashMap<>();
    static Map<String, Integer> IdxByName = new HashMap<>();
    static String[] testInput;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameByIdx.put(i, name);
            IdxByName.put(name, i);
        }

        testInput = new String[t];
        for (int i = 0; i < t; i++) {
            testInput[i] = br.readLine();
        }
    }

    public static void solve() {
        StringBuilder output = new StringBuilder();

        for (String input : testInput) {
            if (isNumeric(input)) {
                output.append(nameByIdx.get(Integer.parseInt(input))).append("\n");
            } else {
                output.append(IdxByName.get(input)).append("\n");
            }
        }

        System.out.print(output.toString());
    }

    private static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}