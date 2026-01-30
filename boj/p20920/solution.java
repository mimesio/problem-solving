package boj.p20920;

import java.io.*;

class Main {

    static String num;

    private static void input() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         num = br.readLine();
    }

    private static void solve() {
        String str;

        if (num.equals("1 2 3 4 5 6 7 8")) {
            str = "ascending";
        } else if (num.equals("8 7 6 5 4 3 2 1")) {
            str =  "descending";
        } else {
            str = "mixed";
        }
        System.out.println(str);
    }

    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
}