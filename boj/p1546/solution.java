package boj.p1546;

import java.util.*;
import java.io.*;

class Main {

    static int n;
    static int[] grades;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        grades = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            grades[i] = Integer.parseInt(st.nextToken());
        }
    }

    public static int getMaxScore() {
        Arrays.sort(grades);
        return grades[n-1];
    }

    public static double[] increaseGrades(double maxScore) {
        double[] increaseGrades = new double[n];

        for (int i = 0; i < n; i++) {
            increaseGrades[i] = 100 * grades[i] / maxScore;
        }
        return increaseGrades;
    }

    public static double getAvgScore(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / (double) n;
    }

    public static void main(String[] args) throws IOException {
        input();
        double maxScore = (double) getMaxScore();
        double[] increasedGrades = increaseGrades(maxScore);
        double avgScore = getAvgScore(increasedGrades);
        System.out.println(avgScore);
    }
}