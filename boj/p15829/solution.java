package boj.p15829;

import java.io.*;

class Main {

    static int n;
    static String input;
    static int[] nums;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        input = br.readLine();
    }

    public static void initArr() {
        char[] charArr = input.toCharArray();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = charArr[i] - 96;
        }
    }

    public static long hash() {
        long sum = 0;
        long pow = 1;
        long M = 1234567891L;
        for (int i = 0; i < n; i++) {
            sum += nums[i] * pow;
            pow = (pow * 31) % M;
        }
        return sum % M;
    }

    public static void main(String[] args) throws IOException {
        input();
        initArr();
        System.out.println(hash());
    }
}