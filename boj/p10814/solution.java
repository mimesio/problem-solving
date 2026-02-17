package boj.p10814;

import java.util.*;
import java.io.*;

class Main {

    static String[][] memberInfo;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        memberInfo = new String[n][2];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            memberInfo[i][0] = st.nextToken(); // age
            memberInfo[i][1] = st.nextToken(); // name
        }
    }

    public static void sort() {
        Arrays.sort(memberInfo, Comparator.comparingInt(o -> Integer.parseInt(o[0])));
    }

    public static void print() {
        StringBuilder output = new StringBuilder();
        for (String[] memberInfo : memberInfo) {
            output.append(memberInfo[0]).append(" ").append(memberInfo[1]).append("\n");
        }
        System.out.println(output.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        sort();
        print();
    }
}