package boj.p1920;

import java.util.*;
import java.io.*;

class Main {

    static Set<Integer> numSet = new HashSet<>();
    static int[] numsForSearch;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numSet.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        numsForSearch = new int[m];
        for (int i = 0; i < m; i++) {
            numsForSearch[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void solve() {
        StringBuilder output = new StringBuilder();
        for (int num : numsForSearch) {
            output.append(isExist(num)).append("\n");
        }
        System.out.print(output.toString());
    }

    private static int isExist(int num) {
        if (numSet.contains(num)) return 1;
        else return 0;
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}