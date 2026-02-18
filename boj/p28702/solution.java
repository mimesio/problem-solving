package boj.p28702;

import java.io.*;

class Main {

    static String[] input = new String[3];

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            input[i] = br.readLine();
        }
    }

    public static String getFizzBuzz(int num) {
        String result;

        if (num % 15 == 0) result = "FizzBuzz";
        else if (num % 3 == 0 && num % 5 != 0) result = "Fizz";
        else if (num % 3 != 0 && num % 5 == 0) result = "Buzz";
        else result = String.valueOf(num);

        return result;
    }

    public static void solve() {
        int idx = 0;
        String num = "";
        int n = 0;
        for (int i = 0; i < 3; i++) {
            if (!(input[i].equals("Fizz") || input[i].equals("Buzz") || input[i].equals("FizzBuzz"))) {
                num = input[i];
                idx = i;
            }
        }
        n = Integer.parseInt(num);
        while (idx != 3) {
            n++;
            idx++;
        }
        System.out.println(getFizzBuzz(n));
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}