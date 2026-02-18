package boj.p2869;

import java.util.*;
import java.io.*;

class Main {

    static int up, down, targetHeight;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        up = Integer.parseInt(st.nextToken());
        down = Integer.parseInt(st.nextToken());
        targetHeight = Integer.parseInt(st.nextToken());
    }

    public static int getDays() {
        int days = (targetHeight - down) / (up - down);
        if ((targetHeight - down) % (up - down) > 0) {
            days++;
        }
        return days;
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(getDays());
    }
}