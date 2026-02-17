package boj.p1259;

import java.util.*;
import java.io.*;

class Main {

    public static List<String> input() throws IOException {
        List<String> nums = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
           String num = br.readLine();
           if (num.equals("0")) break;
           nums.add(num);
        }
        return nums;
    }

    public static void solve(List<String> nums) {
        StringBuilder output = new StringBuilder();
        for (String num : nums) {
            if (isPalindrome(num)) {
                output.append("yes\n");
            } else {
                output.append("no\n");
            }
        }
        System.out.println(output.toString());
    }

    public static boolean isPalindrome(String num) {
        boolean isPalindrome = false;
        char[] digits = num.toCharArray();

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == digits[digits.length-1-i]) {
                isPalindrome = true;
            } else {
                return false;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) throws IOException {
        List<String> nums = input();
        solve(nums);
    }
}