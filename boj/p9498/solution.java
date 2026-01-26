package boj.p9498;

import java.io.*;

class Main {
    static int score;

    private static void input() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            score = Integer.parseInt(br.readLine());
        } catch (Exception e) {

        }
    }

    private static String calculateGrade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        input();
        System.out.println(calculateGrade());
    }
}