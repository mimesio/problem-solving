package boj.p2839;

import java.io.*;

class Main {

    static int totalWeight;

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        totalWeight = Integer.parseInt(br.readLine());
    }

    public static int getMinBundle() {
        int bundle1 = 0;
        int bundle2 = 0;

        if (totalWeight % 5 == 0) {
            bundle1 = totalWeight / 5;
        } else if ((totalWeight % 5) % 3 == 0) {
            bundle1 = totalWeight / 5;
            bundle2 = (totalWeight % 5) / 3;
        } else {
            for (int i = 1; (totalWeight - (5 * i)) > 3; i++) {
                if ((totalWeight - (5 * i)) % 3 == 0) {
                    bundle1 = i;
                    bundle2 = (totalWeight - (5 * i)) / 3;
                }
            }
            if (bundle1 + bundle2 == 0 && totalWeight % 3 == 0) {
                bundle2 = totalWeight / 3;
            }
        }

        return bundle1 + bundle2 != 0 ? bundle1 + bundle2 : -1;
    }

    public static void main(String[] args) throws IOException {
        input();
        System.out.println(getMinBundle());
    }
}

