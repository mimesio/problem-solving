package boj.p2579;

import java.io.*;

class Main {

    static int[] stairs;
    static int n;
    static int[] maxScores;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        stairs = new int[n];
        maxScores = new int[n];

        for (int i = 0; i < n; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void initMaxScores() {
        maxScores[0] = stairs[0];
        if (n >= 2) maxScores[1] = stairs[0] + stairs[1];
        if (n >= 3) maxScores[2] = Math.max(stairs[0] + stairs[2], stairs[1] + stairs[2]);
        if (n >= 4) {
            for (int cur = 3; cur < n; cur++) {
                maxScores[cur] = Math.max(maxScores[cur-3] + stairs[cur-1] + stairs[cur],
                        maxScores[cur-2] + stairs[cur]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        input();
        initMaxScores();
        System.out.print(maxScores[n-1]);
    }
}