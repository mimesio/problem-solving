package boj.p7568;

import java.util.*;
import java.io.*;

class Main {

    public static int[][] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] bodyInfo = new int[n][2];
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            bodyInfo[i][0] = Integer.parseInt(st.nextToken()); // weight
            bodyInfo[i][1] = Integer.parseInt(st.nextToken()); // height
        }
        return bodyInfo;
    }

    public static int[] getRank(int[][] bodyInfo) {
        int[] rank = new int[bodyInfo.length];

        for (int i = 0; i < bodyInfo.length; i ++) {
            int curWeight = bodyInfo[i][0];
            int curHeight = bodyInfo[i][1];
            int count = 0;

            for (int j = 0; j < bodyInfo.length; j++) {
                if (i == j) {
                    continue;
                }
                else if (curWeight < bodyInfo[j][0] && curHeight < bodyInfo[j][1]) {
                    count++;
                }
            }
            rank[i] = count + 1;
        }
        return rank;
    }

    public static void print(int[] rank) {
        StringBuilder output = new StringBuilder();
        for (int r : rank) {
            output.append(r).append(" ");
        }
        System.out.println(output.toString());
    }

    public static void main(String[] args) throws IOException {
        int[][] bodyInfo = input();
        int[] rank = getRank(bodyInfo);
        print(rank);
    }
}