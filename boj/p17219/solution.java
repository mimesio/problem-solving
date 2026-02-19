package boj.p17219;

import java.util.*;
import java.io.*;

class Main {

    static Map<String, String> siteMap = new HashMap<>();
    static int n, s;
    static String[] searchSite;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        searchSite = new String[s];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            siteMap.put(st.nextToken(), st.nextToken());
        }

        for (int i = 0; i < s; i++) {
            searchSite[i] = br.readLine();
        }
    }

    public static void solve() {
        StringBuilder output = new StringBuilder();
        for (String site: searchSite) {
            output.append(siteMap.get(site)).append("\n");
        }
        System.out.println(output.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}