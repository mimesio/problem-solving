package boj.p8958;

import java.io.*;

class Main {

    static String line;
    static StringBuilder sb = new StringBuilder();

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            line = br.readLine();
            calculateScore();
        }
    }

    private static void calculateScore() {
        int count = 0;
        int score = 0;

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'O') {
                count++;
                score += count;
            } else {
                count = 0;
            }
        }

        sb.append(score).append('\n');
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(sb.toString());
    }
}