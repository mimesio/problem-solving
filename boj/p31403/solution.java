package boj.p31403;

import java.io.*;

class Main {

    static int a, b, c;

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
    }

    private static void solve() {
        System.out.println(a+b-c);

        StringBuilder sb = new StringBuilder();
        sb.append(a).append(b);
        System.out.println(Integer.parseInt(sb.toString())-c);
    }

    public static void main(String[] args) throws IOException{
        input();
        solve();
    }
}