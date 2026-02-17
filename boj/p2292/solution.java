package boj.p2292;

import java.io.*;

class Main {

    static int target;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        target = Integer.parseInt(br.readLine());
    }

    public static int getDepth() {
        int depth = 1;
        int end = 1;
        while (target > end) {
            depth++;
            end += 6 * (depth - 1);
        }
        return depth;
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(getDepth());
    }
}