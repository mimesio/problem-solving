package boj.p11654;

import java.io.*;

class Main {
    static int ascii;

    private static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ascii = br.read();
    }

    public static void main(String[] args) throws IOException{
        input();
        System.out.println(ascii);
    }
}