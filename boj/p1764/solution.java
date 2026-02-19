package boj.p1764;

import java.util.*;
import java.io.*;

class Main {

    static Set<String> group1 = new HashSet<>();
    static String[] group2;
    static int n1, n2;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n1 = Integer.parseInt(st.nextToken());
        n2 = Integer.parseInt(st.nextToken());
        group2 = new String[n2];

        for (int i = 0; i < n1; i++) {
            group1.add(br.readLine());
        }

        for (int i = 0; i < n2; i++) {
            group2[i] = br.readLine();
        }
    }

    public static void solve() {
        int intersectionCount = 0;
        List<String> intersectionGroup = new ArrayList<String>();

        for (int i = 0; i < n2; i++) {
            if (group1.contains(group2[i])) {
                intersectionCount++;
                intersectionGroup.add(group2[i]);
            }
        }

        String[] arr = intersectionGroup.toArray(new String[0]);
        Arrays.sort(arr);

        StringBuilder output = new StringBuilder();

        output.append(intersectionCount).append("\n");
        for (String name : arr) {
            output.append(name).append("\n");
        }

        System.out.println(output.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}