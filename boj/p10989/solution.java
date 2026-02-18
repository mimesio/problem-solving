package boj.p10989;

import java.util.*;
import java.io.*;

class Main {

    static int[] nums;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
    }

    public static void print() {
        StringBuilder output = new StringBuilder();
        for (int num : nums) {
            output.append(num).append("\n");
        }
        System.out.println(output.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        Arrays.sort(nums);
        print();
    }
}