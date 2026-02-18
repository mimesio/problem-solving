package boj.p14626;

import java.io.*;

class Main {

    static int[] weights = new int[]{1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1, 3, 1};
    static int starWeight, starIdx;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        char[] nums = line.toCharArray();
        for (int i = 0; i < weights.length; i++) {
            if(nums[i] == '*') {
                starWeight = weights[i];
                starIdx = i;
            } else {
                weights[i] *= nums[i] - '0';
            }
        }
    }

    public static int getStarNum() {
        int starNum = 0;
        int weightSum = getWeightSum();

        while((weightSum + starNum * starWeight) % 10 != 0) {
            starNum++;
        }
        return starNum;
    }

    private static int getWeightSum() {
        int weightSum = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i == starIdx) continue;
            weightSum += weights[i];
        }
        return weightSum;
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(getStarNum());
    }
}
