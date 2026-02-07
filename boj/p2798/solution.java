package boj.p2798;

import java.util.*;
import java.io.*;

class Main {

    static int num, target;
    static int[] cards;

    public static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        num = Integer.parseInt(st.nextToken());
        target = Integer.parseInt(st.nextToken());
        cards = new int[num];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < num; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static void solve() {
        Arrays.sort(cards);
        int sum = 0;
        int max = 0;

        outer: for (int r = num-1; r>1; r--) {
            for (int m = r-1; m>0; m--) {
                for (int l = m-1; l > -1; l--) {
                    sum = cards[l] + cards[m] + cards[r];
                    if (sum > target) continue;
                    else if (sum == target) {
                        max = sum;
                        break outer;
                    }
                    else {
                        if (sum > max) max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }

    public static void main(String[] args) throws IOException{
        input();
        solve();
    }
}




