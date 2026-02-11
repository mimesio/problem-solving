package boj.p10816;

import java.util.*;
import java.io.*;

class Main {

    static Map<Integer, Integer> cardsMap = new HashMap<>();
    static int[] cardsArr;
    static int[] targetArr;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        cardsArr = new int[n];
        for (int i = 0; i < n; i++) {
            cardsArr[i] =  Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        targetArr = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            targetArr[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void initCardsMap() {
        for (int card : cardsArr) {
            if (cardsMap.containsKey(card)) {
                cardsMap.put(card, cardsMap.get(card) + 1);
            } else {
                cardsMap.put(card, 1);
            }
        }
    }

    public static void solve() {
        StringBuilder output = new StringBuilder();

        for (int num : targetArr) {
            if (cardsMap.containsKey(num)) {
                output.append(cardsMap.get(num)).append(" ");
            } else {
                output.append("0 ");
            }
        }

        System.out.println(output.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        initCardsMap();
        solve();
    }
}