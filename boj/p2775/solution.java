package boj.p2775;

import java.io.*;

class Main {

    static int[][] houseInfo;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        houseInfo = new int[testCase][2];
        for (int i = 0; i < testCase; i++) {
            houseInfo[i][0] = Integer.parseInt(br.readLine());
            houseInfo[i][1] = Integer.parseInt(br.readLine());
        }
    }

    private static int getPeople(int k, int n) {
        int peopleCount = 0;

        if (k == 0) {
            peopleCount = n;
        }
        else {
            for (int i = 1; i <= n; i++) {
                peopleCount += getPeople(k-1, i);
            }
        }
        return peopleCount;
    }

    public static void solve() {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < houseInfo.length; i++) {
            output.append(getPeople(houseInfo[i][0], houseInfo[i][1])).append("\n");
        }

        System.out.println(output.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}