package boj.p2751;

import java.util.*;
import java.io.*;

class Main {

    public static int[] input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        return nums;
    }

    public static int[] sort(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    public static void print(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) throws IOException {
        int[] nums = input();
        sort(nums);
        print(nums);
    }
}