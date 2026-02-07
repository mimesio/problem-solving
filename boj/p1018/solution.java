package boj.p1018;

import java.util.*;
import java.io.*;

class Main {

    static String[] chessBoard = new String[]{
            "WBWBWBWB", "BWBWBWBW"
    };

    static int N, M;

    public static String[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        String[] inputBoard = new String[N];
        for (int i = 0; i < N; i++) {
            inputBoard[i] = br.readLine();
        }

        return inputBoard;
    }

    public static void solve(String[] inputBoard) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {
                int curCost = getMinCost(i, j, inputBoard);

                if (curCost < min) {
                    min = curCost;
                }
            }
        }

        System.out.println(min);
    }

    public static int getMinCost(int y, int x, String[] inputBoard) {
        int whiteVerCount = 0;

        for (int raw = 0; raw < 8; raw++) {
            for (int col = 0; col < 8; col++) {
                if (inputBoard[y+raw].charAt(x+col) != chessBoard[raw%2].charAt(col)) {
                    whiteVerCount++;
                }
            }
        }

        int blackVerCount = 64 - whiteVerCount;

        return Math.min(whiteVerCount, blackVerCount);
    }

    public static void main(String[] args) throws IOException{
        String[] inputBoard = input();
        solve(inputBoard);
    }
}

